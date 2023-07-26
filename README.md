# NapierBankSystem

 Description:
Napier Bank Messaging (NBM) is a prototype application developed to validate, sanitize, and categorize incoming messages to Napier Bank in the form of SMS text messages, emails, and Tweets. The system detects the message type (SMS, email, or Tweet) and processes each message accordingly. The processed messages are outputted in JSON format to a file. The program includes functionality to expand textspeak abbreviations, quarantine URLs, and maintain lists of hashtags and mentions for Tweets.

Message Types:
The system handles three types of messages:

SMS Messages: Comprise an international telephone number as the sender and a maximum of 140 characters of text. Textspeak abbreviations in the message body are expanded to their full form enclosed in "<>".
Email Messages: Have a standard email address as the sender, a 20-character subject, and a maximum of 1028 characters of text. Emails may contain embedded URLs, which are quarantined and replaced by "<URL Quarantined>".
Tweets: Include a Twitter ID as the sender (e.g., "@JohnSmith") and a maximum of 140 characters of text. Textspeak abbreviations are expanded, hashtags are recorded for a trending list, and mentions (embedded Twitter IDs) are added to a mentions list.
User Interface:
The User Interface (UI) allows users to input messages in any of the specified forms (SMS, email, or Tweet). The input is taken through a form, such as WPF or Java form. Users provide the Message Header (e.g., "S1234567701") and the Message Body (SMS, email, or Tweet content) in separate text boxes. The system automatically identifies the message type and processes it accordingly. The processed messages are displayed in appropriate text boxes showing the JSON format output. Additionally, the system displays the trending list of hashtags, the list of mentions, and the SIR list (Significant Incident Reports).

Input/Output:

The input can be provided through the UI's input form or an input file.
The output is generated in JSON format and written to a file.
This is not the final version of the program, this one is not connected to any database yet. This is one is the early versions, as the final version will be in C# with database connection.
