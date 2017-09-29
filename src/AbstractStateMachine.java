import java.util.Map;

/**
 * Created by milton on 3/29/17.
 */
public abstract class AbstractStateMachine<T>
{
    protected State startState;

    public State getStartState()
    {
        return startState.getClone();
    }
}
