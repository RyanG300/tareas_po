public class main {
    public static class supermercado{
        int id;
        String nombre;
        String ubicacion;
        int numero_Telefono;
        int numero_Empleados;
        int inventario_Existencias;

        public supermercado(int ii,String nom, String ubi,int nu_t,int n_em,int in_ex){
            this.id=ii;
            this.nombre=nom;
            this.ubicacion=ubi;
            this.numero_Telefono=nu_t;
            this.numero_Empleados=n_em;
            this.inventario_Existencias=in_ex;
        }

        public int comprobar_existencias(){
            return inventario_Existencias;
        }
        public int comprobar_empleados(){
            return numero_Empleados;
        }
    }
    public static class producto{
            int id;
            String nombre;
            String marca;
            String tipo;
            int precio;
            int peso;

            public producto(int ii,String nom,String mar,String ti,int prec,int pes){
                this.id=ii;
                this.nombre=nom;
                this.marca=mar;
                this.tipo=ti;
                this.precio=prec;
                this.peso=pes;
            }

            public void cambiar_precio(int precio){
                this.precio=precio;
            }
            public int pedir_precio(){
                return this.precio;
            }




    }
    public static class empleado{
        int id;
        int cedula;
        String nombre;
        String ubicacion_Hogar;
        int edad;

        public empleado(int ii,int ced, String nom, String ubi_hog,int ed){
            this.id=ii;
            this.cedula=ced;
            this.nombre=nom;
            this.ubicacion_Hogar=ubi_hog;
            this.edad=ed;
        }

        public void trabajar(){
            System.out.println("Trabaja");
        }

        public int revisar_cedula(){
            return this.cedula;
        }
    }
    public static class cliente{
        String nombre;
        int cedula;
        producto pedido;
        int dinero_Cliente;

        public cliente(String nom, int ced, producto ped,int di_Cli){
            this.nombre=nom;
            this.cedula=ced;
            this.pedido=ped;
            this.dinero_Cliente=di_Cli;
        }

        public int pagar_Pedido(){
            return pedido.precio-dinero_Cliente;
        }

        public void nuevo_pedido(producto nuevo_ped){
            this.pedido=nuevo_ped;
        }


    }
}
