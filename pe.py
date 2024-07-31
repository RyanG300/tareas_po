class carrito():
    marca=None
    color=None
    tipo_llantas=None
    tipo=None #Automatico o manual
    def __init__(self,m,c,t_ll,t):
        self.marca=m
        self.color=c
        self.tipo_llantas=t_ll
        self.tipo=t
    def pito(self):
        print("pi pi pi")
    def chocarse(self):
        print("Asterico se choca asterisco")
    def conducir(self):
        if(self.__arrancar_motor()==True):
            print("Asterisco conduce asterisco")
        else:
            print("Imposible")
    
    def __arrancar_motor(self):
        return(True)
    def cambiar_color(self):
        nuevo_color=input("Dame nuevo color pe: ")
        self.color=nuevo_color

class llanta():
    tipo=None
    


mi_carrito=carrito(m="Toyota",c="Rojo",t_ll=19,t="Manual")
mi_carrito.conducir()




        