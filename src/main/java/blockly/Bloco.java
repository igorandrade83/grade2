package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Bloco
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.database.Operations.query(Var.valueOf("app.entity.reserva"),Var.valueOf("select r.id from reserva r where r.user.login = :userLogin"),Var.valueOf("userLogin",cronapi.util.Operations.getCurrentUserName()));
    return cronapi.list.Operations.getFirst(item);
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var dtSourceReserva() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.valueOf("app.entity.reserva"),Var.valueOf("select r from reserva r where r.user.login = :userLogin"),Var.valueOf("userLogin",cronapi.util.Operations.getCurrentUserName()));
   }
 }.call();
}

}

