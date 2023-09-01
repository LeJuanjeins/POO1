from abc import ABC, abstractmethod

# Interfaz para el canal de notificación
class NotificationChannel(ABC):
    @abstractmethod
    def send_message(self, message):
        pass

# Implementación del canal de notificación por correo electrónico
class EmailNotification(NotificationChannel):
    def send_message(self, message):
        return f"Sending email: {message}"

# Implementación del canal de notificación por SMS
class SMSNotification(NotificationChannel):
    def send_message(self, message):
        return f"Sending SMS: {message}"

# Clase de alto nivel que utiliza la abstracción NotificationChannel
class NotificationService:
    def __init__(self, channel):
        self.channel = channel

    def send_notification(self, message):
        return self.channel.send_message(message)

def main():
    email_channel = EmailNotification()
    sms_channel = SMSNotification()

    email_notification = NotificationService(email_channel)
    sms_notification = NotificationService(sms_channel)

    email_result = email_notification.send_notification("Hello via email!")
    sms_result = sms_notification.send_notification("Hello via SMS!")

    print(email_result)
    print(sms_result)

if __name__ == "__main__":
    main()
