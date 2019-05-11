/**
 * Represents the state of a task.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

package Backend;

import java.io.Serializable;

public enum State implements Serializable {
	NotStarted,
	Started,
	Finished
}
