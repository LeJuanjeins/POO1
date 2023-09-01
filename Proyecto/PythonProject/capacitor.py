
from tkinter import Button, Entry, Image, IntVar, Label, StringVar, Toplevel, messagebox
import tkinter
from tkinter.ttk import Combobox
from PIL import Image, ImageTk
from conexion import Conexion

class Capacitor:
    def __init__(self):
        self.capacitor_window = Toplevel()
        self.capacitor_window.title("Capacitance Calculator")
        self.capacitor_window.geometry('564x480')

        icon = tkinter.PhotoImage(file = "C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/capacitorLogo.png")
        self.capacitor_window.iconphoto(True, icon)

        bckgd_img = Image.open("C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/background.jpg")
        bckgd_photo = ImageTk.PhotoImage(bckgd_img)
        bckgd_label = tkinter.Label(self.capacitor_window, image=bckgd_photo)
        bckgd_label.place(x=0, y=0, relwidth=1, relheight=1)
        bckgd_label.image = bckgd_photo
        
        self.label1 = Label(self.capacitor_window, text="Ceramic Capacitor Calculator\n(Capacity - Tolerance)", font=("Arial Bold", 20), bg="white")
        self.label1.grid(row=0, column=0, columnspan=2, pady=20)
        self.label2 = Label(self.capacitor_window, text="Type the first two digits", font=("Arial Bold", 10), bg="white")
        self.label2.grid(row=2, column=0, pady=20)
        vcmd = (self.capacitor_window.register(self.on_validate), '%P')
        self.entry = Entry(self.capacitor_window, validate='key', validatecommand=vcmd)
        self.entry.grid(row=3, column=0, padx=10)

        self.options1 = [" ", 1, 2, 3, 4, 5, 6]
        self.selected_option1 = IntVar()
        self.selected_option1.set(self.options1[0])
        self.combobox1 = Combobox(self.capacitor_window, textvariable=self.selected_option1, values=self.options1, state='readonly')
        self.combobox1.grid(row=2, column=1, padx=10)

        self.options2 = [" ", "C", "J", "K","M", "D", "Z"]
        self.selected_option2 = StringVar()
        self.selected_option2.set(self.options2[0])
        self.combobox2 = Combobox(self.capacitor_window, textvariable=self.selected_option2, values=self.options2, state='readonly')
        self.combobox2.grid(row=3, column=1, padx=10)
        capacitor_img = Image.open("C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/capacitor.png")
        capacitor_photo = ImageTk.PhotoImage(capacitor_img)
        resized_capacitor = capacitor_img.resize((300, 150), Image.LANCZOS)
        capacitor_photo = ImageTk.PhotoImage(resized_capacitor)
        capacitor_label = tkinter.Label(self.capacitor_window, image=capacitor_photo)
        capacitor_label.grid(row=1, column=0, padx=10)
        capacitor_label.image = capacitor_photo
        self.calculate_button = Button(self.capacitor_window, text="Calculate", command=self.update_capacitance)
        self.calculate_button.grid(row=3,column=2,pady=(10,0))
        self.close_button = Button(self.capacitor_window, text="Close", command=self.capacitor_window.destroy)
        self.close_button.grid(row=4,column=2,pady=(10,0))

    def update_capacitance(self):
        cx = Conexion('Color', 'Capacitor')
        query = self.selected_option2.get()
        value = cx.get_tolerance('Capacitor', 'code', query)
        messagebox.showinfo('Capacitance', f'{self.entry.get()}x1e{self.selected_option1.get()}{value} pF')
        
    def on_validate(self, P):
        if len(P) <= 2 and (P.isdigit() or P == ""):
            return True
        else:
            return False
def main():
    capacitor_interface =Capacitor()

if __name__ == "__main__":
    main()
