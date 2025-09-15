
  Feature: verify AWRS URN search functionality

    @test3
    Scenario: verify AWRS URN search functionality

      Given Navigate to the AWRS UI 'https://www.tax.service.gov.uk/check-the-awrs-register'
      When Search for a 'XXAW00000445456'
      Then Not found page is returned
      And search for XXAA 000 0044 5444
      And Invalid page is returned