import streamlit as st
from java_bot_runner import ask_java_bot

st.title("💬 Java ChatBot")

user_input = st.text_input("You:", "")

if user_input:
    bot_response = ask_java_bot(user_input)
    st.text_area("Bot says:", bot_response, height=100)
