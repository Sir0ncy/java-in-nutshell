import javax.swing.JOptionPane;

public class starInt {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah baris!"));

        for (int i=0;i<=n;i++) {

            for (int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}