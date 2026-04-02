package DSA;

public class AssemblyLine {
        static int carAssembly(int a[][], int t[][], int e[], int x[], int n) {
            int T1[] = new int[n];
            int T2[] = new int[n];
            T1[0] = e[0] + a[0][0];
            T2[0] = e[1] + a[1][0];
            for (int i = 1; i < n; i++) {
                T1[i] = Math.min(
                        T1[i - 1] + a[0][i],
                        T2[i - 1] + t[1][i] + a[0][i]
                );
                T2[i] = Math.min(
                        T2[i - 1] + a[1][i],
                        T1[i - 1] + t[0][i] + a[1][i]
                );
            }
            return Math.min(
                    T1[n - 1] + x[0],
                    T2[n - 1] + x[1]
            );
        }
        public static void main(String[] args) {
            int a[][] = {
                    {4, 5, 3, 2},
                    {2, 10, 1, 4}
            };
            int t[][] = {
                    {0, 7, 4, 5},
                    {0, 9, 2, 8}
            };
            int e[] = {10, 12};
            int x[] = {18, 7};
            int n = 4;
            System.out.println("Minimum time: " +
                    carAssembly(a, t, e, x, n));
        }
    }

