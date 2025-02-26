# coding: utf-8

"""
    SaasPro

    APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.<br /><br />Effective January 1st, 2022 all Avalara products will be enforcing TLS 1.2 server-side. Please ensure that your implementation sets a minimal of TLS 1.2 encryption when making web requests to Avalara APIs.  # noqa: E501

    The version of the OpenAPI document: v2
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from avalara.comms.rest.v2.configuration import Configuration


class BundleConfig(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'bundle_package': 'int',
        'bundle_id': 'int',
        'description': 'str',
        'bundle_items': 'list[BundleItem]',
        'version': 'str'
    }

    attribute_map = {
        'bundle_package': 'BundlePackage',
        'bundle_id': 'BundleId',
        'description': 'Description',
        'bundle_items': 'BundleItems',
        'version': 'Version'
    }

    def __init__(self, bundle_package=None, bundle_id=None, description=None, bundle_items=None, version=None, local_vars_configuration=None):  # noqa: E501
        """BundleConfig - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._bundle_package = None
        self._bundle_id = None
        self._description = None
        self._bundle_items = None
        self._version = None
        self.discriminator = None

        if bundle_package is not None:
            self.bundle_package = bundle_package
        if bundle_id is not None:
            self.bundle_id = bundle_id
        self.description = description
        self.bundle_items = bundle_items
        self.version = version

    @property
    def bundle_package(self):
        """Gets the bundle_package of this BundleConfig.  # noqa: E501

        Bundle Package - example:  20000  # noqa: E501

        :return: The bundle_package of this BundleConfig.  # noqa: E501
        :rtype: int
        """
        return self._bundle_package

    @bundle_package.setter
    def bundle_package(self, bundle_package):
        """Sets the bundle_package of this BundleConfig.

        Bundle Package - example:  20000  # noqa: E501

        :param bundle_package: The bundle_package of this BundleConfig.  # noqa: E501
        :type: int
        """

        self._bundle_package = bundle_package

    @property
    def bundle_id(self):
        """Gets the bundle_id of this BundleConfig.  # noqa: E501

        Bundle Id - example:  20001  # noqa: E501

        :return: The bundle_id of this BundleConfig.  # noqa: E501
        :rtype: int
        """
        return self._bundle_id

    @bundle_id.setter
    def bundle_id(self, bundle_id):
        """Sets the bundle_id of this BundleConfig.

        Bundle Id - example:  20001  # noqa: E501

        :param bundle_id: The bundle_id of this BundleConfig.  # noqa: E501
        :type: int
        """

        self._bundle_id = bundle_id

    @property
    def description(self):
        """Gets the description of this BundleConfig.  # noqa: E501

        Bundle Description  # noqa: E501

        :return: The description of this BundleConfig.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this BundleConfig.

        Bundle Description  # noqa: E501

        :param description: The description of this BundleConfig.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def bundle_items(self):
        """Gets the bundle_items of this BundleConfig.  # noqa: E501

        Bundled items - percentage should add up to 100% (as applicable)  # noqa: E501

        :return: The bundle_items of this BundleConfig.  # noqa: E501
        :rtype: list[BundleItem]
        """
        return self._bundle_items

    @bundle_items.setter
    def bundle_items(self, bundle_items):
        """Sets the bundle_items of this BundleConfig.

        Bundled items - percentage should add up to 100% (as applicable)  # noqa: E501

        :param bundle_items: The bundle_items of this BundleConfig.  # noqa: E501
        :type: list[BundleItem]
        """

        self._bundle_items = bundle_items

    @property
    def version(self):
        """Gets the version of this BundleConfig.  # noqa: E501

        Version for bundle - intended to allow changes to format   without having to perform expensive SQL updates on existing bundles  # noqa: E501

        :return: The version of this BundleConfig.  # noqa: E501
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """Sets the version of this BundleConfig.

        Version for bundle - intended to allow changes to format   without having to perform expensive SQL updates on existing bundles  # noqa: E501

        :param version: The version of this BundleConfig.  # noqa: E501
        :type: str
        """

        self._version = version

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, BundleConfig):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BundleConfig):
            return True

        return self.to_dict() != other.to_dict()
