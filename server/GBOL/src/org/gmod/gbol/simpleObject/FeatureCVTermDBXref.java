package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.FeatureCVTermDBXref.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class FeatureCVTermDBXref extends org.gmod.gbol.simpleObject.generated.AbstractFeatureCVTermDBXref {

	private static final long serialVersionUID = 1L;

	public FeatureCVTermDBXref(){
		super();
	}

//	@Override
//	public Collection<AbstractSimpleObject> getWriteObjects() {
//		ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//		// Have to write yourself
//		writeObjects.add(this);
//		
//		// Singletons
//		writeObjects.addAll(this.getDbxref().getWriteObjects());
//		
//		return writeObjects;
//	}

	public AbstractSimpleObjectIterator getWriteableObjects()
	{
		return new SimpleObjectIterator(this);
	}
	
	private static class SimpleObjectIterator extends AbstractSimpleObjectIterator
	{

		private static class Status extends AbstractSimpleObjectIterator.Status
		{
			public final static int dbxref = 1;
		}
	
		public SimpleObjectIterator(FeatureCVTermDBXref featureCvtermDbxref)
		{
			super(featureCvtermDbxref);
		}
		
		public AbstractSimpleObject next()
		{
			FeatureCVTermDBXref featureCvtermDbxref = (FeatureCVTermDBXref)object;
			AbstractSimpleObject retVal = null;
			if (status == Status.self) {
				retVal = peek();
				processSingletonIterator(Status.dbxref, featureCvtermDbxref.getDbxref());
			}
			else {
				if (status == Status.dbxref) {
					retVal = soIter.next();
				}
			}
			current = retVal;
			return retVal;
		}
	}

}