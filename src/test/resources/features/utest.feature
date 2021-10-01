#Autor: Juan Galvis

@stories
  Feature: utest Register
    As a user, I want to register on the utest platform, with my personal information

  @scenario1
  Scenario Outline:
    Given That Juan wants to register in uTest

    When he send the required information
      | strFirstName |  strLastName|  strEmail| strBirthDay | strBirthMonth | strBirthYear |  strLanguages| strCity | strZipCode |  strCountry| strOSPC  | strVersionPC    | strLanguagePC   | strMobileDeviceBrand  | strMobileDeviceModel  | strMobileDeviceOS   |strPassword |
      |<strFirstName>|<strLastName>|<strEmail>|<strBirthDay>|<strBirthMonth>|<strBirthYear>|<strLanguages>|<strCity>|<strZipCode>|<strCountry>|<strOSPC> | <strVersionPC>  | <strLanguagePC> |<strMobileDeviceBrand> | <strMobileDeviceModel>| <strMobileDeviceOS> |<strPassword>|
    Then te sign up is complete when he receives the complete setup button
      |strMessage  |
      |<strMessage>|

    Examples:
      | strFirstName |  strLastName|  strEmail                      | strBirthDay   | strBirthMonth| strBirthYear  |strLanguages   | strCity                 | strZipCode              | strCountry  | strOSPC      | strVersionPC    | strLanguagePC         | strMobileDeviceBrand  | strMobileDeviceModel| strMobileDeviceOS   |strPassword  | strMessage      |
      | Juan         |  Galvis     |sebastiiangalviis@gmail.com   | 13            | March        | 2002          |Spanish        | Bogotá,bogota,colombia  |111141                   | Colombia    | Windows      | 10              | Spanish               |  Motorola             | G9 Play                  | Android 11          |9_L%U5$wm?T&)FW   | Complete Setup  |

