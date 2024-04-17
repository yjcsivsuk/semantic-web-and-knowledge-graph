import org.apache.jena.query.*;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.reasoner.rulesys.GenericRuleReasoner;
import org.apache.jena.reasoner.rulesys.Rule;
import org.apache.jena.util.FileManager;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class OWL_search {
    public static void query(String file_path, String sparql){
        List<String> list= new ArrayList<>();
        try{
            Model model = ModelFactory.createDefaultModel();
            InputStream file= FileManager.get().open(file_path);
            //reasoner内置的推理
            model.read(file,null);
            Query query= QueryFactory.create(sparql);
            Reasoner reasoner= ReasonerRegistry.getOWLReasoner();
            InfModel infModel=ModelFactory.createInfModel(reasoner,model);
            QueryExecution ex= QueryExecutionFactory.create(query,infModel);
            ResultSet result= ex.execSelect();
            String result_string=ResultSetFormatter.asText(result);
            System.out.println(result_string);
            list.add(result_string);
            ex.close();
            //自定义规则的推理
            List<Rule> rules=Rule.rulesFromURL("C:\\Users\\14737\\IdeaProjects\\com.tust\\RDF\\src\\main\\resources\\reasoning.rule");
            GenericRuleReasoner custom_reasoner=new GenericRuleReasoner(rules);
            custom_reasoner.setMode(GenericRuleReasoner.FORWARD);
            InfModel infModel1=ModelFactory.createInfModel(custom_reasoner,model);
            Query qu=QueryFactory.create(sparql);
            QueryExecution custom_ex=QueryExecutionFactory.create(qu,infModel1);
            ResultSet rs=custom_ex.execSelect();
            String output=ResultSetFormatter.asText(rs);
            list.add(output);
            System.out.println(output);
            custom_ex.close();
        }
        catch (Exception e){
            list.add("Exception:"+e.getMessage());
        }
    }

    public static void main(String[] args){
        String sparql_content =
                "PREFIX test:<http://www.semanticweb.org/14737/ontologies/2023/8/untitled-ontology-11#>\n" +
                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \n" +
                        "\n" +
                        "select ?n \n" +
                        "where\n"+
                        "{?y rdf:type test:transportation."+
                        "?y test:name ?n."+
                        "}";
        String sparql_content2 =
                "PREFIX work:<http://www.semanticweb.org/14737/ontologies/2023/8/untitled-ontology-11#>\n" +
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \n" +
                "\n" +
                "select ?n \n" +
                "where\n"+
                "{?y work:work_place_in work:land."+
                "?y work:name ?n."+
                "}";
        String filepath = "C:\\Users\\14737\\IdeaProjects\\com.tust\\RDF\\src\\main\\resources\\OWL_transportation.owl";
        System.out.println("query1 result:");
        query(filepath,sparql_content);
        System.out.println("query2 result:");
        query(filepath,sparql_content2);
    }
}
