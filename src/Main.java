import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int codMenuPpal, codMenuTipico;
        do {
            String menu = "El roble\n\n";
            menu += "1. Plato Típico\n";
            menu += "2. Plato a la carta\n";
            menu += "3. Plato internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opción: ";

            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menú Principal", JOptionPane.PLAIN_MESSAGE));

            switch (codMenuPpal) {
                case 1:
                    do {
                        String menuTipico = "MENÚ TÍPICO\n\n";
                        menuTipico += "1. Frijoles\n";
                        menuTipico += "2. Sopa de Verduras\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "Por favor seleccione una opción: ";

                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(null, menuTipico, "Menú Típico", JOptionPane.PLAIN_MESSAGE));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $12,000",
                                        "Pedido", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Sopa de Verduras, el costo es de $8,000",
                                        "Pedido", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido",
                                        "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                    } while (codMenuTipico != 3);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Menú Plato a la Carta - En construcción",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Menú Plato Internacional - En construcción",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema. ¡Hasta pronto!",
                            "Despedida", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido",
                            "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);
    }
}