# openapi-java-client

SaasPro
- API version: v2
  - Build date: 2021-08-04T15:26:12.946-04:00[America/New_York]

APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.<br /><br />Effective January 1st, 2022 all Avalara products will be enforcing TLS 1.2 server-side. Please ensure that your implementation sets a minimal of TLS 1.2 encryption when making web requests to Avalara APIs.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:v2"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v2.jar`
* `target/lib/*.jar`

## Using TLS 1.2 or higherAvalara endpoints require a minimum of TLS 1.2. For an application using JDK 8 or higher, the best version of TLS will be used automatically. To enforce TLS 1.2 in your application, please review https://www.java.com/en/configure_crypto.html.## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    

    CustomizationApi apiInstance = new CustomizationApi(defaultClient);
    Integer requestedClientId = 56; // Integer | Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable.
    Integer requestedProfileId = 56; // Integer | Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set.
    ClientProfileConfigTypes itemType = new ClientProfileConfigTypes(); // ClientProfileConfigTypes | Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All
    try {
      ClientProfileConfigResponse result = apiInstance.apiV2ProfilesGetProfilesGet(requestedClientId, requestedProfileId, itemType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomizationApi#apiV2ProfilesGetProfilesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomizationApi* | [**apiV2ProfilesGetProfilesGet**](docs/CustomizationApi.md#apiV2ProfilesGetProfilesGet) | **GET** /api/v2/profiles/GetProfiles | Retrieves one or more profiles with associated settings and configurable items
*HealthCheckApi* | [**apiV2HealthCheckGet**](docs/HealthCheckApi.md#apiV2HealthCheckGet) | **GET** /api/v2/HealthCheck | Health check that confirms the service is operational and ready to use
*JurisdictionDeterminationApi* | [**apiV2AfcPCodePost**](docs/JurisdictionDeterminationApi.md#apiV2AfcPCodePost) | **POST** /api/v2/afc/PCode | Get PCode(s) associated with a location - Ctry/State/County/City/Zip/NpaNxx/Fips.
*JurisdictionDeterminationApi* | [**apiV2GeoBatchLogProcessIdGet**](docs/JurisdictionDeterminationApi.md#apiV2GeoBatchLogProcessIdGet) | **GET** /api/v2/geo/batch/log/{processId} | Retrieves log on Geo Batch file
*JurisdictionDeterminationApi* | [**apiV2GeoBatchStatusProcessIdGet**](docs/JurisdictionDeterminationApi.md#apiV2GeoBatchStatusProcessIdGet) | **GET** /api/v2/geo/batch/status/{processId} | Retrieves information on Geo Batch file status
*JurisdictionDeterminationApi* | [**apiV2GeoBatchUploadPost**](docs/JurisdictionDeterminationApi.md#apiV2GeoBatchUploadPost) | **POST** /api/v2/geo/batch/Upload | Uploads file to Geo Batch.
*JurisdictionDeterminationApi* | [**apiV2GeoGeocodePost**](docs/JurisdictionDeterminationApi.md#apiV2GeoGeocodePost) | **POST** /api/v2/geo/Geocode | Geocodes one or multiple street addresses and/or lat/long coordinate pairs.
*LookupsApi* | [**apiV2AfcLocationPCodeGet**](docs/LookupsApi.md#apiV2AfcLocationPCodeGet) | **GET** /api/v2/afc/location/{pCode} | Get location data associated with a PCode
*LookupsApi* | [**apiV2AfcPrimaryPCodeGet**](docs/LookupsApi.md#apiV2AfcPrimaryPCodeGet) | **GET** /api/v2/afc/primary/{pCode} | Get primary location data associated with a PCode
*LookupsApi* | [**apiV2AfcServiceinfoGet**](docs/LookupsApi.md#apiV2AfcServiceinfoGet) | **GET** /api/v2/afc/serviceinfo | Retrieves server time, service build version and engine version
*LookupsApi* | [**apiV2AfcTaxtypeTaxTypeGet**](docs/LookupsApi.md#apiV2AfcTaxtypeTaxTypeGet) | **GET** /api/v2/afc/taxtype/{taxType} | Get the tax information (description and category) for a tax type ID
*LookupsApi* | [**apiV2AfcTspairsGet**](docs/LookupsApi.md#apiV2AfcTspairsGet) | **GET** /api/v2/afc/tspairs | Get transaction/service pair information
*TaxCalculationApi* | [**apiV2AfcCalcTaxesPost**](docs/TaxCalculationApi.md#apiV2AfcCalcTaxesPost) | **POST** /api/v2/afc/CalcTaxes | Performs tax calculations on all invoices and line items within the request body.
*TaxCalculationApi* | [**apiV2AfcCommitPost**](docs/TaxCalculationApi.md#apiV2AfcCommitPost) | **POST** /api/v2/afc/Commit | Commits or un-commits a document code.


## Documentation for Models

 - [Address](docs/Address.md)
 - [BillingPeriod](docs/BillingPeriod.md)
 - [BundleConfig](docs/BundleConfig.md)
 - [BundleItem](docs/BundleItem.md)
 - [CalcTaxesRequest](docs/CalcTaxesRequest.md)
 - [CalcTaxesResponse](docs/CalcTaxesResponse.md)
 - [ClientProfileConfigResponse](docs/ClientProfileConfigResponse.md)
 - [ClientProfileConfigTypes](docs/ClientProfileConfigTypes.md)
 - [CommitRequest](docs/CommitRequest.md)
 - [CommitResponse](docs/CommitResponse.md)
 - [CompanyData](docs/CompanyData.md)
 - [Error](docs/Error.md)
 - [Exclusion](docs/Exclusion.md)
 - [ExclusionConfig](docs/ExclusionConfig.md)
 - [GeoBatchDownloadResponse](docs/GeoBatchDownloadResponse.md)
 - [GeoBatchLog](docs/GeoBatchLog.md)
 - [GeoBatchLogItem](docs/GeoBatchLogItem.md)
 - [GeoBatchStatus](docs/GeoBatchStatus.md)
 - [GeoBatchSubmitFileResponse](docs/GeoBatchSubmitFileResponse.md)
 - [GeocodeRequest](docs/GeocodeRequest.md)
 - [GeocodeResult](docs/GeocodeResult.md)
 - [InlineObject](docs/InlineObject.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceResult](docs/InvoiceResult.md)
 - [KeyValuePair](docs/KeyValuePair.md)
 - [LineItem](docs/LineItem.md)
 - [LineItemResult](docs/LineItemResult.md)
 - [Location](docs/Location.md)
 - [LocationItem](docs/LocationItem.md)
 - [ModelConfiguration](docs/ModelConfiguration.md)
 - [NexusConfig](docs/NexusConfig.md)
 - [OverrideConfig](docs/OverrideConfig.md)
 - [PCodeLookupRequest](docs/PCodeLookupRequest.md)
 - [PCodeLookupResult](docs/PCodeLookupResult.md)
 - [ReportingInformation](docs/ReportingInformation.md)
 - [RequestConfig](docs/RequestConfig.md)
 - [SafeHarborOverride](docs/SafeHarborOverride.md)
 - [ServiceInfo](docs/ServiceInfo.md)
 - [Status](docs/Status.md)
 - [SummarizedTax](docs/SummarizedTax.md)
 - [Tax](docs/Tax.md)
 - [TaxBracket](docs/TaxBracket.md)
 - [TaxExemption](docs/TaxExemption.md)
 - [TaxOverride](docs/TaxOverride.md)
 - [TaxTypeData](docs/TaxTypeData.md)
 - [TrafficStudyOverride](docs/TrafficStudyOverride.md)
 - [TsPairData](docs/TsPairData.md)
 - [VersionInfo](docs/VersionInfo.md)
 - [Warning](docs/Warning.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



