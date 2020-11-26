<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <html>
        <body>
            <h2>Weather data in 3 cities:</h2>
                <table border="1">
                    <tr bgcolor="lightgrey">
                        <th>ID</th>
                        <th>Day</th>
                        <th>Chicago</th>
                        <th>Chennai</th>
                        <th>Berlin</th>
                    </tr>
                    <xsl:for-each select="weather/row">
                        <tr>
                            <td><xsl:value-of select="@dayid"/></td>
                            <td><xsl:value-of select="day"/></td>
                            <td><xsl:value-of select="chicago"/></td>
                            <td><xsl:value-of select="chennai"/></td>
                            <td><xsl:value-of select="berlin"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>