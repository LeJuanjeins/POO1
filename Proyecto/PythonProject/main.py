from tkinter import *
import tkinter
from PIL import Image, ImageTk
from capacitor import Capacitor
from contact import Contact
from inductor import Inductor
from resistor import Resistor

window = Tk()

window.title("Calculator")
window.geometry('540x480')

icon = tkinter.PhotoImage(file = "C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/mainLogo.png")
window.iconphoto(True, icon)

bckgd_img = Image.open("C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/background.jpg")
bckgd_photo = ImageTk.PhotoImage(bckgd_img)
bckgd_label = tkinter.Label(window, image=bckgd_photo)
bckgd_label.place(x=0, y=0, relwidth=1, relheight=1)
bckgd_label.image = bckgd_photo

label1 = Label(window, text = "Select which Calculator\nyou want to use", font=("Bradley Hand ITC",25))
label1.place(x=540/2, y=60, anchor='center')

def accionbutton1():
    resistor_interface = Resistor()

def accionbutton2():
    capacitor_interface = Capacitor()

def accionbutton3():
    inductor_interface = Inductor()

def accionbutton4():
    contact_interface = Contact()

button1 = Button(window, text="Resistance",font=("Arial Bold",15),bg="brown",fg="white", command=accionbutton1)
button1.place(x=170, y=150, anchor='center')
resistor_img = Image.open("C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/resistorLogo.png")
resistor_photo = ImageTk.PhotoImage(resistor_img)
resized_resistor = resistor_img.resize((100, 100), Image.LANCZOS)
resistor_photo = ImageTk.PhotoImage(resized_resistor)
resistor_label = tkinter.Label(window, image=resistor_photo)
resistor_label.place(x=360, y=165, anchor='center')
resistor_label.image = resistor_photo

button2 = Button(window,text="Capacitance",font=("Arial Bold",15),bg="brown",fg="white", command=accionbutton2)
button2.place(x=170, y=(480)*4/8, anchor='center')
capacitor_img = Image.open("C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/capacitorLogo.png")
capacitor_photo = ImageTk.PhotoImage(capacitor_img)
resized_capacitor = capacitor_img.resize((100, 100), Image.LANCZOS)
capacitor_photo = ImageTk.PhotoImage(resized_capacitor)
capacitor_label = tkinter.Label(window, image=capacitor_photo)
capacitor_label.place(x=360, y=(480)*4/8, anchor='center')
capacitor_label.image = capacitor_photo

button3 = Button(window,text="Inductance",font=("Arial Bold",15),bg="brown",fg="white", command=accionbutton3)
button3.place(x=170, y=325, anchor='center')
inductor_img = Image.open("C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/inductorLogo.png")
inductor_photo = ImageTk.PhotoImage(inductor_img)
resized_inductor = inductor_img.resize((100, 100), Image.LANCZOS)
inductor_photo = ImageTk.PhotoImage(resized_inductor)
inductor_label = tkinter.Label(window, image=inductor_photo)
inductor_label.place(x=360, y=325, anchor='center')
inductor_label.image = inductor_photo

button4 = Button(window,text="Contact Us",font=("Arial Bold",15),bg="brown",fg="white", command=accionbutton4)
button4.place(x=400, y=400, anchor='center')



window.mainloop()
