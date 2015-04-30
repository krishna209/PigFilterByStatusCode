package pigUDF.StatusFilter;

import org.apache.pig.FilterFunc;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.data.Tuple;

public class StatusFilter extends FilterFunc {
	public Boolean exec(Tuple tuple) throws ExecException
	{
		if(tuple == null || tuple.size() == 0)
		{
			return false;
		}
		Object object  = tuple.get(0);
		if(object==null)
		{
			return false;
		}
		int i=(Integer)object;
		return i == 200;
		
	}
}
