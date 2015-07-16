import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by samantha on 7/16/15.
 */
public class ReduceVerbosity {

    //Static factory methods reduce the verbosity of creating parameterized type instances.

    Map<String, List<String>> m = new HashMap<String, List<String>>();


/*Unfortunately, you must specify the type parameters when you invoke the constructor of a parameterized class.*/
 /*This typically requires you to provide the type parameters twice in quick succession.*/
 /*This redundant specification quickly becomes painful as the length and complexity of the type parameters increase*/

//Convert as=====================================>


    public static <K, V> HashMap<K, V> newInstance() {
        return new HashMap<K, V>();
    }

    //Then call as
   // Map<String, List<String>> m = HashMap.newInstance();
}