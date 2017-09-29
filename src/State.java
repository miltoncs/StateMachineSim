/**
 * Created by milton on 3/29/17.
 */
public class State
{
    String name;

    State getClone()
    {
        State clone = new State();
        clone.name = name;
        return clone;
    }
}
