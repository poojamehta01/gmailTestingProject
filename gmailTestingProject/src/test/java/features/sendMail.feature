Feature: sendMail
  sendMail

  @sendMail
  Scenario: 
    Given User is on Login Page of the application
    When User logs in with username and password
    Then Verify user is on Main page
    
    And User clicks on compose button on Main page
    Then Verify sendMail open successfully
    
    When User enters sendTo,Subject,messageBody on SendMail page
   	And User uploads attachment
    And User clicks on send button on SendMail page 
    Then Verify messageSent is visible on the Main Page
    
    Then verify mailSent on the SentMails Page
    
    