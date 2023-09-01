from tkinter import Button, Entry, Image, Label, Toplevel, messagebox
import tkinter
from PIL import Image, ImageTk
from conexion import Conexion

class Contact:
    def __init__(self):
        self.contact_window = Toplevel()
        self.contact_window.title("Contact")
        self.contact_window.geometry('540x380')

        bckgd_img = Image.open("imagenes/background.jpg")
        bckgd_photo = ImageTk.PhotoImage(bckgd_img)
        bckgd_label = tkinter.Label(self.contact_window, image=bckgd_photo)
        bckgd_label.place(x=0, y=0, relwidth=1, relheight=1)
        bckgd_label.image = bckgd_photo

        self.label = Label(self.contact_window, text="Enter your data in the right place", font=("Bradley Hand ITC",25), bg="white")
        self.label.place(x=540/2, y=60, anchor='center')

        self.label1 = Label(self.contact_window, text="First name", font=("Arial Bold",15), bg="white")
        self.label1.place(x=120, y=120, anchor='center')
        self.entry1 = Entry(self.contact_window)
        self.entry1.place(x=120, y=150, anchor='center')
        
        self.label2 = Label(self.contact_window, text="Last name", font=("Arial Bold",15), bg="white")
        self.label2.place(x=240, y=120, anchor='center')
        self.entry2 = Entry(self.contact_window)
        self.entry2.place(x=240, y=150, anchor='center')

        self.label3 = Label(self.contact_window, text="Email", font=("Arial Bold",15), bg="white")
        self.label3.place(x=360, y=120, anchor='center')
        self.entry3 = Entry(self.contact_window)
        self.entry3.place(x=360, y=150, anchor='center')

        self.register_button = Button(self.contact_window, text="Register",font=("Arial Bold",10),bg="orange", command=self.save_data)
        self.register_button.place(x=500, y=230, anchor='center')

    
    def save_data(self):
        cx = Conexion('Color', 'User')
        cx.get_contact('User',self.entry1.get(),self.entry2.get(), self.entry3.get())
        messagebox.showinfo('Contact', 'Thank you, we will\ncontact you soon')
        self.contact_window.destroy()

def main():
    contact_interface = Contact()

if __name__ == "__main__":
    main()