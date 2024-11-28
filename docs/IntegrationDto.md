# IntegrationDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**title** | **String** |  |  [optional]
**nameIdentifier** | **String** |  |  [optional]
**shortDescription** | **String** |  |  [optional]
**icon** | **String** |  |  [optional]
**releaseStatus** | **AllOfIntegrationDtoReleaseStatus** |   0 &#x3D; Released  1 &#x3D; Pending  2 &#x3D; NotPlanned |  [optional]
**launchDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**documentationUrl** | **String** |  |  [optional]
**swaggerUrl** | **String** |  |  [optional]
**integrationEndpoints** | [**List&lt;IntegrationEndpointDto&gt;**](IntegrationEndpointDto.md) |  |  [optional]
**integrationEvents** | [**List&lt;IntegrationEventDto&gt;**](IntegrationEventDto.md) |  |  [optional]
