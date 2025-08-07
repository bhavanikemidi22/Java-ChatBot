import subprocess

def ask_java_bot(user_input):
    # Run the compiled Java class
    result = subprocess.run(
        ['java', 'chatbot.ChatBot'],  # Assuming package is chatbot
        input=user_input,
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE
    )
    return result.stdout.strip()

