package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Class1394 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// 1394
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.dynCombobox9622"), cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.name from User u")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

