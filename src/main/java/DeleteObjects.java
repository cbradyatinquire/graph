import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class DeleteObjects implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {} );
		//deletes ALL objects
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}