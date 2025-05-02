public class StackSurat12 {
    Surat12[] stack;
    int top;
    int size;

    public StackSurat12(int size) {
        this.size = size;
        stack = new Surat12[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat12 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat izin berhasil diterima.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat12 pop() {
        if (!isEmpty()) {
            Surat12 suratDiproses = stack[top--];
            System.out.println("Surat izin diproses:");
            suratDiproses.tampilkanSurat();
            return suratDiproses;
        } else {
            System.out.println("Tidak ada surat izin untuk diproses.");
            return null;
        }
    }

    public Surat12 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat izin yang tersedia.");
            return null;
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat izin ditemukan:");
                stack[i].tampilkanSurat();
                return true;
            }
        }
        System.out.println("Surat izin tidak ditemukan untuk mahasiswa " + namaMahasiswa);
        return false;
    }
}