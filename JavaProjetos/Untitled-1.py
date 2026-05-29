import pyautogui
import time
#pyautogui.press-> pressiona uma tecla
#pyautogui.write-> escreve texto
#pyautogui.click-> aperta algum lugar da tela
#pyautogui.hotkey-> aperta um atalho
#time.sleep()
pyautogui.PAUSE = 1
pyautogui.press("win")
pyautogui.click(x=102, y=558)
time.sleep(3)
pyautogui.write("WhatsApp web")
time.sleep(3)
pyautogui.press("enter")
time.sleep(3)
pyautogui.click(x=289, y=295)
time.sleep(30)
pyautogui.click(x=293, y=419)
pyautogui.write("Também amo a senhora")
pyautogui.press("enter")