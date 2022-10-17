package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/raiz/{op}")
public class Raiz {
    
    @GET
    public double calcula(@PathParam("op") String opStr) {
        double operador = Double.parseDouble(opStr);
        if (operador < 0) {
            throw new BadRequestException("Essa calculadora só opera nos números reais não-negativos.");
        } 
        return raiz(operador);
    }

    protected double raiz(double op) {
        return Math.sqrt(op);
    }
}
