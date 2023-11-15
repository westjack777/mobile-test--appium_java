Feature: Login the VODQA app

  @login_positive @login
  Scenario Outline: Login the VODQA app
    Given The user is on login screen
    When the user authenticates using "<username>" username and "<password>" password
    Then the user should be in Samples List screen

    Examples:
      | username  | password  |
      | admin     | admin     |

#  @login_negative @login
#  Scenario Outline: The user cannot authenticate using wrong credentials
#    Given The user is on login screen
#    When the user authenticates using "<username>" username and "<password>" password
#    Then an error message "<message>" should be displayed
#
#    Examples:
#      | username  | password  | message                                       |
#      | admin     | password  | Invalid credentials! Please check your data.  |