package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/raiz/{op}")
public class Raiz {
    
    @GET
    public double calcula(@PathParam("op") String opStr) {
        try {
            double op = Double.parseDouble(opStr);
            if (op < 0) {
                throw new BadRequestException("A calculadora só opera nos reais. Não funciono com números imaginários.");    
            }
            return Math.sqrt(op);
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}
