package dia01;

// Imprima no console a ficha de um host de rede
// Host: srv-web01
// IP: 10.172.18.250 255.255.255.0
// VLAN: 200
// Status: ativo

public class FichaHost {
    public static void main(String[] args) {
      String host = "srv-web01";
      String ipaddress = "10.172.18.250 255.255.255.0";
      int vlan = 200;
      String status = "ativo";
      System.out.println("Host: " + host);
      System.out.println("Ip Address: " + ipaddress);
      System.out.println("VLAN: " + vlan);
      System.out.println("Status: " + status);

      

    }
}
