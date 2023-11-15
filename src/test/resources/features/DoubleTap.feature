Feature: Double tap a button

  @doubletap
  Scenario Outline: Double tap a button
    Given The user is on Samples List screen
    When the user navigates to "Double Tap" page
      And the user double tap the "Double Tap Me" button
    Then a message "<message>" should be displayed

    Examples:
      |  message                  |
      |  Double tap successful!   |