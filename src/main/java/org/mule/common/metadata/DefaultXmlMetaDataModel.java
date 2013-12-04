package org.mule.common.metadata;

import org.mule.common.metadata.datatype.DataType;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class DefaultXmlMetaDataModel extends AbstractMetaDataModel implements XmlMetaDataModel {

    private List<String> schemas;
    private String rootElement;
    private Charset encoding;
	private String example;

    public DefaultXmlMetaDataModel(List<String> schemas, String rootElement, Charset encoding) {
    	super(DataType.XML);
    	this.schemas = schemas;
    	this.rootElement = rootElement;
    	this.encoding = encoding;
    }

    @Override
    public String getRootElement() {
        return rootElement;
    }

    @Override
    public List<InputStream> getSchemas() {
        List<InputStream> result = new ArrayList<InputStream>();
        for (String schema : schemas) {
            result.add(new ByteArrayInputStream(schema.getBytes(encoding)));
        }
        return result;
    }

	@Override
    public void accept(MetaDataModelVisitor modelVisitor) {
    	modelVisitor.visitXmlMetaDataModel(this);
    }

	@Override
	public String getExample() {
		return example;
	}

	@Override
	public void setExample(String xmlExample) {
		this.example = xmlExample;
	}
}
