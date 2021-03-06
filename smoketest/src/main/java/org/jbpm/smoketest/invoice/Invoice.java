package org.jbpm.smoketest.invoice;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class Invoice  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String description;
    
    @org.kie.api.definition.type.Position(value = 1)
    private java.util.List<org.jbpm.smoketest.invoice.InvoiceLine> lines;
    
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String user;

    public Invoice() {
    }

    public Invoice(java.lang.String user, java.util.List<org.jbpm.smoketest.invoice.InvoiceLine> lines, java.lang.String description) {
        this.user = user;
        this.lines = lines;
        this.description = description;
    }


    
    public java.lang.String getDescription() {
        return this.description;
    }

    public void setDescription(  java.lang.String description ) {
        this.description = description;
    }
    
    public java.util.List<org.jbpm.smoketest.invoice.InvoiceLine> getLines() {
        return this.lines;
    }

    public void setLines(  java.util.List<org.jbpm.smoketest.invoice.InvoiceLine> lines ) {
        this.lines = lines;
    }
    
    public java.lang.String getUser() {
        return this.user;
    }

    public void setUser(  java.lang.String user ) {
        this.user = user;
    }
}