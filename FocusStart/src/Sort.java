import java.io.*;

public class Sort {

    public static void main(String[] args) {
        String fileInput = args[3];
        String fileInput1 = args[4];
        String fileInput2 = args[2];


        File file = new File(fileInput);
        File file1 = new File(fileInput1);
        File file2 = new File(fileInput2);
        PrintWriter pw = null;
        BufferedReader br = null;
        BufferedReader br1 = null;

        try {

            pw = new PrintWriter(file2);
            br = new BufferedReader(new FileReader(file));
            br1 = new BufferedReader(new FileReader(file1));

            String a;
            String b;

            while ((a = br.readLine()) != null && (b = br1.readLine()) != null) {
                int i = Integer.parseInt(a);
                int j = Integer.parseInt(b);
                if (i < j) {
                    pw.println(i);
                    while ((a = br.readLine()) != null) {
                        i = Integer.parseInt(a);
                        if (i < j) {
                            pw.println(i);
                        } else if (j < i) {
                            while ((b = br1.readLine()) != null) {
                                pw.println(j);
                                j = Integer.parseInt(b);
                                if (j < i) {
                                    pw.println(j);
                                } else if (i < j) {
                                    pw.println(i);
                                    break;
                                } else if ((a = br.readLine()) == null) {
                                    break;
                                }
                            }
                        } else {
                            pw.println(i);
                            pw.println(j);
                        }
                    }
                } else if (j < i) {
                    while ((b = br1.readLine()) != null) {
                        pw.println(j);
                        j = Integer.parseInt(b);
                        if (j > i) {
                            while ((a = br.readLine()) != null) {
                                pw.println(i);
                                i = Integer.parseInt(a);
                                if (i > j) {
                                    pw.println(j);
                                    break;
                                }
                            }
                        }
                        if (i == j) {
                            pw.println(i);
                            pw.println(j);
                        } else if ((b = br1.readLine()) == null) {
                            break;
                        }
                    }
                }
                if (i == j) {
                    pw.println(i);
                    pw.println(j);
                }
                if ((a = br.readLine()) == null) {
                    while ((b = br1.readLine()) != null) {
                        j = Integer.parseInt(b);
                        pw.println(j);
                    }
                }
                if ((b = br1.readLine()) == null) {
                    while ((a = br.readLine()) != null) {
                        i = Integer.parseInt(a);
                        pw.println(i);
                    }
                }
            }

            pw.close();
            br.close();
            br1.close();

            try {

                br = new BufferedReader(new FileReader("out.txt"));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);

                }
            } catch (IOException e) {
                System.out.println("Error " + e);

            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
