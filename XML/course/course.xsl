<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <head>
        <title>课程目录</title>
      </head>
      <body>
        <h1>课程目录</h1>
        <xsl:apply-templates select="courses/course"/>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="course">
    <h2><xsl:value-of select="title"/></h2>
    <p>讲师： <xsl:value-of select="instructor"/></p>
    <p>描述： <xsl:value-of select="description"/></p>
    <p>时长： <xsl:value-of select="duration"/></p>
    <hr/>
  </xsl:template>
</xsl:stylesheet>