import java.util.*;
import java.util.function.BiFunction;

/**
 * Created by milton on 3/29/17.
 */
public class DFAMachine<T> extends AbstractStateMachine
{
    private Map<State, Map<T, State>> transitions = new HashMap<>();
    private State currentState = getStartState();

    public DFAMachine(Map<State, Map<T, State>>> transitions, State currentState)
    {
        this.transitions = transitions;
    }

    public State runIterations(int iterations, T[] input)
    {
        for (int i = 0; i < iterations; i++)
        {
            
        }
    }
}
