class FileManager:
    def __init__(self, file_name):
        self.file_name = file_name

    def read_file(self):
        with open(self.file_name, 'r') as file:
            content = file.read()
        return content

    def write_file(self, content):
        with open(self.file_name, 'w') as file:
            file.write(content)


class TextProcessor:
    @staticmethod
    def process_text(text):
        # Aquí se realizaría algún procesamiento del texto
        # como por ejemplo contar palabras o eliminar espacios
        return text.upper()


if __name__ == "__main__":
    file_manager = FileManager("data.txt")
    content = file_manager.read_file()

    processed_text = TextProcessor.process_text(content)

    file_manager.write_file(processed_text)
