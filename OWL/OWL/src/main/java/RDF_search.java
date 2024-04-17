import org.apache.jena.query.*;
import org.apache.jena.rdf.model.*;
import org.apache.jena.util.FileManager;
import java.io.InputStream;

public class RDF_search {
    public static void query(String file_path, String sparql){
        try{
            Model model = ModelFactory.createDefaultModel();
            InputStream file= FileManager.get().open(file_path);
            model.read(file,null);
            Query query= QueryFactory.create(sparql);
            QueryExecution ex= QueryExecutionFactory.create(query,model);
            ResultSet result= ex.execSelect();
            String result_string=ResultSetFormatter.asText(result);
            System.out.println(result_string);
            ex.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.getMessage();
        }
    }
    public static void main(String[] args){
        String filepath="C:\\Users\\14737\\IdeaProjects\\com.tust\\RDF\\src\\main\\resources\\RDF_transportation.rdf";
        String sparql_content =
                "PREFIX test: <http://www.semanticweb.org/14737/ontologies/2023/8/untitled-ontology-11#>\n" +
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+
                "SELECT ?n\n" +
                "WHERE\n" +
                "  { ?y  rdf:type  test:plane.\n" +
                "?y test:name ?n."+
                "  }";
        query(filepath,sparql_content);
    }
}
