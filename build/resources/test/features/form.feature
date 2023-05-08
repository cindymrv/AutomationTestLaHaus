#language: en

Feature: Validate the form
  I as a quality analyst
  I want that when the user fill the form to register a student, the system responds correctly
  to validate the form

  Scenario Outline:Scenario to validate the form to register a student
    Given that the 'user' is located in pointing to the base url
    When the user enters the menu Form to fill the 'Practice Form'
    And the 'user' fills the form correctly with
      | First Name      | <First Name>      |
      | Last Name       | <Last Name>       |
      | Email           | <Email>           |
      | Gender          | <Gender>          |
      | Mobile          | <Mobile>          |
      | Date of Birth   | <Date of Birth>   |
      | Subjects        | <Subjects>        |
      | Hobbies         | <Hobbies>         |
      | Picture         | <Picture>         |
      | Current Address | <Current Address> |
      | State           | <State>           |
      | City            | <City>            |
    Then the 'user' can see the thanks message
    Examples:
      | First Name | Last Name   | Email                 | Gender | Mobile     | Date of Birth | Subjects         | Hobbies | Picture                                 | Current Address | State | City  |
      | Prueba     | La pruebita | prueba@lapruebita.com | Other  | 3117894785 | 17 Ago 1989   | Computer Science | paint   | src/test/resources/pictures/pastel.webp | calle 123       | NCR   | Delhi |

