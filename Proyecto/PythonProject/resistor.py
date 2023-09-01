import tkinter
from tkinter import messagebox
from tkinter import *
from tkinter.ttk import Combobox
from PIL import Image, ImageTk
from conexion import Conexion

class Resistor:
    def __init__(self):
        self.resistor_window = Toplevel()
        self.resistor_window.title("Resistance Calculator")
        self.resistor_window.geometry('564x480')

        icon = tkinter.PhotoImage(file = "C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/resistorLogo.png")
        self.resistor_window.iconphoto(True, icon)

        bckgd_img = Image.open("C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/background.jpg")
        bckgd_photo = ImageTk.PhotoImage(bckgd_img)
        bckgd_label = tkinter.Label(self.resistor_window, image=bckgd_photo)
        bckgd_label.place(x=0, y=0, relwidth=1, relheight=1)
        bckgd_label.image = bckgd_photo

        self.label = Label(self.resistor_window, text="Resistance Calculator", font=("Arial Bold", 20), bg="white")
        self.label.grid(row=0, column=0, columnspan=2, pady=20)

        self.options1 = [" ", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"]
        self.selected_option1 = StringVar()
        self.selected_option1.set(self.options1[0])

        self.options2 = [" ", "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"]
        self.selected_option2 = StringVar()
        self.selected_option2.set(self.options2[0])

        self.options3 = [" ", "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"]
        self.selected_option3 = StringVar()
        self.selected_option3.set(self.options3[0])

        self.options4 = [" ", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "gold", "silver"]
        self.selected_option4 = StringVar()
        self.selected_option4.set(self.options4[0])

        resistor_img = Image.open("C:/Users/Juan Jose/OneDrive - UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE/Documentos/POO/GITHUB/Proyecto/PythonProject/imagenes/resistor.png")
        resistor_photo = ImageTk.PhotoImage(resistor_img)
        resized_resistor = resistor_img.resize((300, 150), Image.ANTIALIAS)
        resistor_photo = ImageTk.PhotoImage(resized_resistor)
        resistor_label = tkinter.Label(self.resistor_window, image=resistor_photo)
        resistor_label.grid(row=1, column=0, padx=10)
        resistor_label.image = resistor_photo

        self.combobox1 = Combobox(self.resistor_window, textvariable=self.selected_option1, values=self.options1, state='readonly')
        self.combobox1.grid(row=2, column=0, padx=10)
        self.combobox2 = Combobox(self.resistor_window, textvariable=self.selected_option2, values=self.options2,state='readonly')
        self.combobox2.grid(row=3, column=0, padx=10)
        self.combobox3 = Combobox(self.resistor_window, textvariable=self.selected_option3, values=self.options3,state='readonly')
        self.combobox3.grid(row=4, column=0, padx=10)
        self.combobox4 = Combobox(self.resistor_window, textvariable=self.selected_option4, values=self.options4,state='readonly')
        self.combobox4.grid(row=5, column=0, padx=10)

        self.calculate_button = Button(self.resistor_window, text="Calculate", command=self.update_resistance)
        self.calculate_button.grid(row=5,column=1,pady=(10,0))

        self.close_button = Button(self.resistor_window, text="Close", command=self.resistor_window.destroy)
        self.close_button.grid(row=6,columnspan=2,pady=(10,0),sticky="e")

        self.resistor_window.mainloop()
        
    def update_resistance(self):
            cx = Conexion('Color', 'Color')
            query1 =  self.selected_option1.get()
            query2 =  self.selected_option2.get()
            query3 =  self.selected_option3.get()
            query4 =  self.selected_option4.get()
            value1 = cx.get_color_value('Color', query1)
            value2 = cx.get_color_value('Color', query2)
            band = cx.get_multiplier_band('Color', query3)
            tol = cx.get_tolerance('Color','colors', query4)
            resistance = (f"Resistance: {value1}{value2}x{band}, tol:{tol} \u03A9 ")
            messagebox.showinfo("Resultado", resistance)

def main():
    resistor_calculator = Resistor()

if __name__ == "__main__":
    main()