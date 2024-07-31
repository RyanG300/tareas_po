class carrito():
    marca=None
    color=None
    llantas=None
    tipo=None #Automatico o manual
    def __init__(self,m,c,t):
        self.marca=m
        self.color=c
        self.llantas=[]
        for i in range(3):
            p=llanta("No conosco tipos de llantas xd")
            self.llantas.append(p)
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
    def __init__(self,type):
        self.tipo=type
    def sonido_llanta(self):
        print("Asterisco sonido de llanta asterisco")
        


mi_carrito=carrito(m="Toyota",c="Rojo",t="Manual")
mi_carrito.conducir()




        