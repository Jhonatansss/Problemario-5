import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class EscribirCliente {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Juan", "Perez", 1000.0));
        clientes.add(new Cliente(2, "Maria", "Lopez", 1500.0));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clientes.dat"))) {
            oos.writeObject(clientes);
            System.out.println("Clientes escritos en el archivo correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
