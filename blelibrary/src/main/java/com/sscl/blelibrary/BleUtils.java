package com.sscl.blelibrary;

import java.util.HashMap;
import java.util.Map;

/**
 * UUID名称获取工具类
 *
 * @author jackie
 */
@SuppressWarnings("unused")
public class BleUtils {
    private static Map<String, String> ATTRIBUTES = new HashMap<>();
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    static {
        ATTRIBUTES.put("00001800-0000-1000-8000-00805f9b34fb", "GenericAccess");
        ATTRIBUTES.put("00001801-0000-1000-8000-00805f9b34fb", "GenericAttribute");
        ATTRIBUTES.put("00002800-0000-1000-8000-00805f9b34fb", "Primary Service");
        ATTRIBUTES.put("00002801-0000-1000-8000-00805f9b34fb", "Secondary Service");
        ATTRIBUTES.put("00002802-0000-1000-8000-00805f9b34fb", "Include");
        ATTRIBUTES.put("00002803-0000-1000-8000-00805f9b34fb", "Characteristic");
        ATTRIBUTES.put("00002900-0000-1000-8000-00805f9b34fb", "Characteristic Extended Properties");
        ATTRIBUTES.put("00002901-0000-1000-8000-00805f9b34fb", "Characteristic User Description");
        ATTRIBUTES.put("00002902-0000-1000-8000-00805f9b34fb", "Client Characteristic Configuration");
        ATTRIBUTES.put("00002903-0000-1000-8000-00805f9b34fb", "Server Characteristic Configuration");
        ATTRIBUTES.put("00002904-0000-1000-8000-00805f9b34fb", "Characteristic Presentation Format");
        ATTRIBUTES.put("00002905-0000-1000-8000-00805f9b34fb", "Characteristic Aggregate Format");
        ATTRIBUTES.put("00002906-0000-1000-8000-00805f9b34fb", "Valid Range");
        ATTRIBUTES.put("00002907-0000-1000-8000-00805f9b34fb", "External Report Reference Descriptor");
        ATTRIBUTES.put("00002908-0000-1000-8000-00805f9b34fb", "Report Reference Descriptor");
        ATTRIBUTES.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        ATTRIBUTES.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        ATTRIBUTES.put("00002a02-0000-1000-8000-00805f9b34fb", "Peripheral Privacy Flag");
        ATTRIBUTES.put("00002a03-0000-1000-8000-00805f9b34fb", "Reconnection Address");
        ATTRIBUTES.put("00002a04-0000-1000-8000-00805f9b34fb", "PPCP");
        ATTRIBUTES.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");
        ATTRIBUTES.put("00001802-0000-1000-8000-00805f9b34fb", "Immediate Alert");
        ATTRIBUTES.put("00001803-0000-1000-8000-00805f9b34fb", "Link Loss");
        ATTRIBUTES.put("00001804-0000-1000-8000-00805f9b34fb", "Tx Power");
        ATTRIBUTES.put("00001805-0000-1000-8000-00805f9b34fb", "Current Time Service");
        ATTRIBUTES.put("00001806-0000-1000-8000-00805f9b34fb", "Reference Time Update Service");
        ATTRIBUTES.put("00001807-0000-1000-8000-00805f9b34fb", "Next DST Change Service");
        ATTRIBUTES.put("00001808-0000-1000-8000-00805f9b34fb", "Glucose");
        ATTRIBUTES.put("00001809-0000-1000-8000-00805f9b34fb", "Health Thermometer");
        ATTRIBUTES.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information");
        ATTRIBUTES.put("0000180b-0000-1000-8000-00805f9b34fb", "Network Availability");
        ATTRIBUTES.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate");
        ATTRIBUTES.put("0000180e-0000-1000-8000-00805f9b34fb", "Phone Alert Status Service");
        ATTRIBUTES.put("0000180f-0000-1000-8000-00805f9b34fb", "Battery Service");
        ATTRIBUTES.put("00001810-0000-1000-8000-00805f9b34fb", "Blood Pressure");
        ATTRIBUTES.put("00001811-0000-1000-8000-00805f9b34fb", "Alert Notification Service");
        ATTRIBUTES.put("00001812-0000-1000-8000-00805f9b34fb", "Human Interface Device");
        ATTRIBUTES.put("00001813-0000-1000-8000-00805f9b34fb", "Scan Parameters");
        ATTRIBUTES.put("00001814-0000-1000-8000-00805f9b34fb", "Running Speed and Cadence");
        ATTRIBUTES.put("00001816-0000-1000-8000-00805f9b34fb", "Cycling Speed and Cadence");
        ATTRIBUTES.put("00001818-0000-1000-8000-00805f9b34fb", "Cycling Power");
        ATTRIBUTES.put("00001819-0000-1000-8000-00805f9b34fb", "Location and Navigation");
        ATTRIBUTES.put("00002700-0000-1000-8000-00805f9b34fb", "GATT_UNITLESS");
        ATTRIBUTES.put("00002701-0000-1000-8000-00805f9b34fb", "GATT_UNIT_LENGTH_METER");
        ATTRIBUTES.put("00002702-0000-1000-8000-00805f9b34fb", "GATT_UNIT_MASS_KGRAM");
        ATTRIBUTES.put("00002703-0000-1000-8000-00805f9b34fb", "GATT_UNIT_TIME_SECOND");
        ATTRIBUTES.put("00002704-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ELECTRIC_CURRENT_A");
        ATTRIBUTES.put("00002705-0000-1000-8000-00805f9b34fb", "GATT_UNIT_THERMODYNAMIC_TEMP_K");
        ATTRIBUTES.put("00002706-0000-1000-8000-00805f9b34fb", "GATT_UNIT_AMOUNT_SUBSTANCE_M");
        ATTRIBUTES.put("00002707-0000-1000-8000-00805f9b34fb", "GATT_UNIT_LUMINOUS_INTENSITY_C");
        ATTRIBUTES.put("00002710-0000-1000-8000-00805f9b34fb", "GATT_UNIT_AREA_SQ_MTR");
        ATTRIBUTES.put("00002711-0000-1000-8000-00805f9b34fb", "GATT_UNIT_VOLUME_CUBIC_MTR");
        ATTRIBUTES.put("00002712-0000-1000-8000-00805f9b34fb", "GATT_UNIT_VELOCITY_MPS");
        ATTRIBUTES.put("00002713-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ACCELERATION_MPS_SQ");
        ATTRIBUTES.put("00002714-0000-1000-8000-00805f9b34fb", "GATT_UNIT_WAVENUMBER_RM");
        ATTRIBUTES.put("00002715-0000-1000-8000-00805f9b34fb", "GATT_UNIT_DENSITY_KGPCM");
        ATTRIBUTES.put("00002716-0000-1000-8000-00805f9b34fb", "GATT_UNIT_SURFACE_DENSITY_KGPSM");
        ATTRIBUTES.put("00002717-0000-1000-8000-00805f9b34fb", "GATT_UNIT_SPECIFIC_VOLUME_CMPKG");
        ATTRIBUTES.put("00002718-0000-1000-8000-00805f9b34fb", "GATT_UNIT_CURRENT_DENSITY_APSM");
        ATTRIBUTES.put("00002719-0000-1000-8000-00805f9b34fb", "GATT_UNIT_MAGNETIC_FIELD_STRENGTH");
        ATTRIBUTES.put("0000271a-0000-1000-8000-00805f9b34fb", "GATT_UNIT_AMOUNT_CONCENTRATE_MPCM");
        ATTRIBUTES.put("0000271b-0000-1000-8000-00805f9b34fb", "GATT_UNIT_MASS_CONCENTRATE_KGPCM");
        ATTRIBUTES.put("0000271e-0000-1000-8000-00805f9b34fb", "GATT_UNIT_RELATIVE_PERMEABLILTY");
        ATTRIBUTES.put("00002720-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PLANE_ANGLE_RAD");
        ATTRIBUTES.put("00002721-0000-1000-8000-00805f9b34fb", "GATT_UNIT_SOLID_ANGLE_STERAD");
        ATTRIBUTES.put("00002722-0000-1000-8000-00805f9b34fb", "GATT_UNIT_FREQUENCY_HTZ");
        ATTRIBUTES.put("00002723-0000-1000-8000-00805f9b34fb", "GATT_UNIT_FORCE_NEWTON");
        ATTRIBUTES.put("00002724-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PRESSURE_PASCAL");
        ATTRIBUTES.put("00002725-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ENERGY_JOULE");
        ATTRIBUTES.put("00002726-0000-1000-8000-00805f9b34fb", "GATT_UNIT_POWER_WATT");
        ATTRIBUTES.put("00002727-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ELECTRIC_CHARGE_C");
        ATTRIBUTES.put("00002728-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ELECTRIC_POTENTIAL_DIF_V");
        ATTRIBUTES.put("0000272f-0000-1000-8000-00805f9b34fb", "GATT_UNIT_CELSIUS_TEMP_DC");
        ATTRIBUTES.put("00002760-0000-1000-8000-00805f9b34fb", "GATT_UNIT_TIME_MINUTE");
        ATTRIBUTES.put("00002761-0000-1000-8000-00805f9b34fb", "GATT_UNIT_TIME_HOUR");
        ATTRIBUTES.put("00002762-0000-1000-8000-00805f9b34fb", "GATT_UNIT_TIME_DAY");
        ATTRIBUTES.put("00002763-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PLANE_ANGLE_DEGREE");
        ATTRIBUTES.put("00002764-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PLANE_ANGLE_MINUTE");
        ATTRIBUTES.put("00002765-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PLANE_ANGLE_SECOND");
        ATTRIBUTES.put("00002766-0000-1000-8000-00805f9b34fb", "GATT_UNIT_AREA_HECTARE");
        ATTRIBUTES.put("00002767-0000-1000-8000-00805f9b34fb", "GATT_UNIT_VOLUME_LITRE");
        ATTRIBUTES.put("00002768-0000-1000-8000-00805f9b34fb", "GATT_UNIT_MASS_TONNE");
        ATTRIBUTES.put("000027a0-0000-1000-8000-00805f9b34fb", "GATT_UINT_LENGTH_YARD");
        ATTRIBUTES.put("000027a1-0000-1000-8000-00805f9b34fb", "GATT_UNIT_LENGTH_PARSEC");
        ATTRIBUTES.put("000027a2-0000-1000-8000-00805f9b34fb", "GATT_UNIT_LENGTH_INCH");
        ATTRIBUTES.put("000027a3-0000-1000-8000-00805f9b34fb", "GATT_UNIT_LENGTH_FOOT");
        ATTRIBUTES.put("000027a4-0000-1000-8000-00805f9b34fb", "GATT_UNIT_LENGTH_MILE");
        ATTRIBUTES.put("000027a5-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PRESSURE_PFPSI");
        ATTRIBUTES.put("000027a6-0000-1000-8000-00805f9b34fb", "GATT_UNIT_VELOCITY_KMPH");
        ATTRIBUTES.put("000027a7-0000-1000-8000-00805f9b34fb", "GATT_UNIT_VELOCITY_MPH");
        ATTRIBUTES.put("000027a8-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ANGULAR_VELOCITY_RPM");
        ATTRIBUTES.put("000027a9-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ENERGY_GCAL");
        ATTRIBUTES.put("000027aa-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ENERGY_KCAL");
        ATTRIBUTES.put("000027ab-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ENERGY_KWH");
        ATTRIBUTES.put("000027ac-0000-1000-8000-00805f9b34fb", "GATT_UNIT_THERMODYNAMIC_TEMP_DF");
        ATTRIBUTES.put("000027ad-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PERCENTAGE");
        ATTRIBUTES.put("000027ae-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PER_MILE");
        ATTRIBUTES.put("000027af-0000-1000-8000-00805f9b34fb", "GATT_UNIT_PERIOD_BPM");
        ATTRIBUTES.put("000027b0-0000-1000-8000-00805f9b34fb", "GATT_UNIT_ELECTRIC_CHARGE_AH");
        ATTRIBUTES.put("000027b1-0000-1000-8000-00805f9b34fb", "GATT_UNIT_MASS_DENSITY_MGPD");
        ATTRIBUTES.put("000027b2-0000-1000-8000-00805f9b34fb", "GATT_UNIT_MASS_DENSITY_MMPL");
        ATTRIBUTES.put("000027b3-0000-1000-8000-00805f9b34fb", "GATT_UNIT_TIME_YEAR");
        ATTRIBUTES.put("000027b4-0000-1000-8000-00805f9b34fb", "GATT_UNIT_TIME_MONTH");
        ATTRIBUTES.put("00002a06-0000-1000-8000-00805f9b34fb", "Alert Level");
        ATTRIBUTES.put("00002a07-0000-1000-8000-00805f9b34fb", "Tx Power Level");
        ATTRIBUTES.put("00002a08-0000-1000-8000-00805f9b34fb", "Date Time");
        ATTRIBUTES.put("00002a09-0000-1000-8000-00805f9b34fb", "Day of Week");
        ATTRIBUTES.put("00002a0a-0000-1000-8000-00805f9b34fb", "Day Date Time");
        ATTRIBUTES.put("00002a0c-0000-1000-8000-00805f9b34fb", "Exact Time 256");
        ATTRIBUTES.put("00002a0d-0000-1000-8000-00805f9b34fb", "DST Offset");
        ATTRIBUTES.put("00002a0e-0000-1000-8000-00805f9b34fb", "Time Zone");
        ATTRIBUTES.put("00002a0f-0000-1000-8000-00805f9b34fb", "Local Time Information");
        ATTRIBUTES.put("00002a11-0000-1000-8000-00805f9b34fb", "Time with DST");
        ATTRIBUTES.put("00002a12-0000-1000-8000-00805f9b34fb", "Time Accuracy");
        ATTRIBUTES.put("00002a13-0000-1000-8000-00805f9b34fb", "Time Source");
        ATTRIBUTES.put("00002a14-0000-1000-8000-00805f9b34fb", "Reference Time Information");
        ATTRIBUTES.put("00002a16-0000-1000-8000-00805f9b34fb", "Time Update Control Point");
        ATTRIBUTES.put("00002a17-0000-1000-8000-00805f9b34fb", "Time Update State");
        ATTRIBUTES.put("00002a18-0000-1000-8000-00805f9b34fb", "Glucose Measurement");
        ATTRIBUTES.put("00002a19-0000-1000-8000-00805f9b34fb", "Battery Level");
        ATTRIBUTES.put("00002a1c-0000-1000-8000-00805f9b34fb", "Temperature Measurement");
        ATTRIBUTES.put("00002a1d-0000-1000-8000-00805f9b34fb", "Temperature Type");
        ATTRIBUTES.put("00002a1e-0000-1000-8000-00805f9b34fb", "Intermediate Temperature");
        ATTRIBUTES.put("00002a21-0000-1000-8000-00805f9b34fb", "Measurement Interval");
        ATTRIBUTES.put("00002a22-0000-1000-8000-00805f9b34fb", "Boot Keyboard Input Report");
        ATTRIBUTES.put("00002a23-0000-1000-8000-00805f9b34fb", "System ID");
        ATTRIBUTES.put("00002a24-0000-1000-8000-00805f9b34fb", "Model Number String");
        ATTRIBUTES.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number String");
        ATTRIBUTES.put("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Revision String");
        ATTRIBUTES.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Revision String");
        ATTRIBUTES.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Revision String");
        ATTRIBUTES.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        ATTRIBUTES.put("00002a2a-0000-1000-8000-00805f9b34fb", "IEEE 11073-20601 Regulatory Certification Data List");
        ATTRIBUTES.put("00002a2b-0000-1000-8000-00805f9b34fb", "Current Time");
        ATTRIBUTES.put("00002a31-0000-1000-8000-00805f9b34fb", "Scan Refresh");
        ATTRIBUTES.put("00002a32-0000-1000-8000-00805f9b34fb", "Boot Keyboard Output Report");
        ATTRIBUTES.put("00002a33-0000-1000-8000-00805f9b34fb", "Boot Mouse Input Report");
        ATTRIBUTES.put("00002a34-0000-1000-8000-00805f9b34fb", "Glucose Measurement Context");
        ATTRIBUTES.put("00002a35-0000-1000-8000-00805f9b34fb", "Blood Pressure Measurement");
        ATTRIBUTES.put("00002a36-0000-1000-8000-00805f9b34fb", "Intermediate Cuff Pressure");
        ATTRIBUTES.put("00002a37-0000-1000-8000-00805f9b34fb", "Heart Rate Measurement");
        ATTRIBUTES.put("00002a38-0000-1000-8000-00805f9b34fb", "Body Sensor Location");
        ATTRIBUTES.put("00002a39-0000-1000-8000-00805f9b34fb", "Heart Rate Control Point");
        ATTRIBUTES.put("00002a3e-0000-1000-8000-00805f9b34fb", "Network Availability");
        ATTRIBUTES.put("00002a3f-0000-1000-8000-00805f9b34fb", "Alert Status");
        ATTRIBUTES.put("00002a40-0000-1000-8000-00805f9b34fb", "Ringer Control Point");
        ATTRIBUTES.put("00002a41-0000-1000-8000-00805f9b34fb", "Ringer Setting");
        ATTRIBUTES.put("00002a42-0000-1000-8000-00805f9b34fb", "Alert Category ID Bit Mask");
        ATTRIBUTES.put("00002a43-0000-1000-8000-00805f9b34fb", "Alert Category ID");
        ATTRIBUTES.put("00002a44-0000-1000-8000-00805f9b34fb", "Alert Notification Control Point");
        ATTRIBUTES.put("00002a45-0000-1000-8000-00805f9b34fb", "Unread Alert Status");
        ATTRIBUTES.put("00002a46-0000-1000-8000-00805f9b34fb", "New Alert");
        ATTRIBUTES.put("00002a47-0000-1000-8000-00805f9b34fb", "Supported New Alert Category");
        ATTRIBUTES.put("00002a48-0000-1000-8000-00805f9b34fb", "Supported Unread Alert Category");
        ATTRIBUTES.put("00002a49-0000-1000-8000-00805f9b34fb", "Blood Pressure Feature");
        ATTRIBUTES.put("00002a4a-0000-1000-8000-00805f9b34fb", "HID Information");
        ATTRIBUTES.put("00002a4b-0000-1000-8000-00805f9b34fb", "Report Map");
        ATTRIBUTES.put("00002a4c-0000-1000-8000-00805f9b34fb", "HID Control Point");
        ATTRIBUTES.put("00002a4d-0000-1000-8000-00805f9b34fb", "Report");
        ATTRIBUTES.put("00002a4e-0000-1000-8000-00805f9b34fb", "Protocol Mode");
        ATTRIBUTES.put("00002a4f-0000-1000-8000-00805f9b34fb", "Scan Interval Window");
        ATTRIBUTES.put("00002a50-0000-1000-8000-00805f9b34fb", "PnP ID");
        ATTRIBUTES.put("00002a51-0000-1000-8000-00805f9b34fb", "Glucose Feature");
        ATTRIBUTES.put("00002a52-0000-1000-8000-00805f9b34fb", "Record Access Control Point");
        ATTRIBUTES.put("00002a53-0000-1000-8000-00805f9b34fb", "RSC Measurement");
        ATTRIBUTES.put("00002a54-0000-1000-8000-00805f9b34fb", "RSC Feature");
        ATTRIBUTES.put("00002a55-0000-1000-8000-00805f9b34fb", "SC Control Point");
        ATTRIBUTES.put("00002a5b-0000-1000-8000-00805f9b34fb", "CSC Measurement");
        ATTRIBUTES.put("00002a5c-0000-1000-8000-00805f9b34fb", "CSC Feature");
        ATTRIBUTES.put("00002a5d-0000-1000-8000-00805f9b34fb", "Sensor Location");
        ATTRIBUTES.put("00002a63-0000-1000-8000-00805f9b34fb", "Cycling Power Measurement");
        ATTRIBUTES.put("00002a64-0000-1000-8000-00805f9b34fb", "Cycling Power Vector");
        ATTRIBUTES.put("00002a65-0000-1000-8000-00805f9b34fb", "Cycling Power Feature");
        ATTRIBUTES.put("00002a66-0000-1000-8000-00805f9b34fb", "Cycling Power Control Point");
        ATTRIBUTES.put("00002a67-0000-1000-8000-00805f9b34fb", "Location and Speed");
        ATTRIBUTES.put("00002a68-0000-1000-8000-00805f9b34fb", "Navigation");
        ATTRIBUTES.put("00002a69-0000-1000-8000-00805f9b34fb", "Position Quality");
        ATTRIBUTES.put("00002a6a-0000-1000-8000-00805f9b34fb", "LN Feature");
        ATTRIBUTES.put("00002a6b-0000-1000-8000-00805f9b34fb", "LN Control Point");
        ATTRIBUTES.put("0000aa00-0000-1000-8000-00805f9b34fb", "IRTEMPERATURE_SERV");
        ATTRIBUTES.put("0000aa01-0000-1000-8000-00805f9b34fb", "IRTEMPERATURE_DATA");
        ATTRIBUTES.put("0000aa02-0000-1000-8000-00805f9b34fb", "IRTEMPERATURE_CONF");
        ATTRIBUTES.put("0000aa10-0000-1000-8000-00805f9b34fb", "ACCELEROMETER_SERV");
        ATTRIBUTES.put("0000aa11-0000-1000-8000-00805f9b34fb", "ACCELEROMETER_DATA");
        ATTRIBUTES.put("0000aa12-0000-1000-8000-00805f9b34fb", "ACCELEROMETER_CONF");
        ATTRIBUTES.put("0000aa13-0000-1000-8000-00805f9b34fb", "ACCELEROMETER_PERI");
        ATTRIBUTES.put("0000aa30-0000-1000-8000-00805f9b34fb", "MAGNETOMETER_SERV");
        ATTRIBUTES.put("0000aa31-0000-1000-8000-00805f9b34fb", "MAGNETOMETER_DATA");
        ATTRIBUTES.put("0000aa32-0000-1000-8000-00805f9b34fb", "MAGNETOMETER_CONF");
        ATTRIBUTES.put("0000aa33-0000-1000-8000-00805f9b34fb", "MAGNETOMETER_PERI");
        ATTRIBUTES.put("0000aa40-0000-1000-8000-00805f9b34fb", "BAROMETER_SERV");
        ATTRIBUTES.put("0000aa41-0000-1000-8000-00805f9b34fb", "BAROMETER_DATA");
        ATTRIBUTES.put("0000aa42-0000-1000-8000-00805f9b34fb", "BAROMETER_CONF");
        ATTRIBUTES.put("0000aa43-0000-1000-8000-00805f9b34fb", "BAROMETER_CALI");
        ATTRIBUTES.put("0000aa50-0000-1000-8000-00805f9b34fb", "GYROSCOPE_SERV");
        ATTRIBUTES.put("0000aa51-0000-1000-8000-00805f9b34fb", "GYROSCOPE_DATA");
        ATTRIBUTES.put("0000aa52-0000-1000-8000-00805f9b34fb", "GYROSCOPE_CONF");
        ATTRIBUTES.put("0000aa60-0000-1000-8000-00805f9b34fb", "TEST_SERV");
        ATTRIBUTES.put("0000aa61-0000-1000-8000-00805f9b34fb", "TEST_DATA");
        ATTRIBUTES.put("0000aa62-0000-1000-8000-00805f9b34fb", "TEST_CONF");
        ATTRIBUTES.put("0000ffe0-0000-1000-8000-00805f9b34fb", "SK Service");
        ATTRIBUTES.put("0000ffe1-0000-1000-8000-00805f9b34fb", "SK_KEYPRESSED");
        ATTRIBUTES.put("0000ffa0-0000-1000-8000-00805f9b34fb", "Accelerometer Service");
        ATTRIBUTES.put("0000ffa1-0000-1000-8000-00805f9b34fb", "ACCEL_ENABLER");
        ATTRIBUTES.put("0000ffa2-0000-1000-8000-00805f9b34fb", "ACCEL_RANGE");
        ATTRIBUTES.put("0000ffa3-0000-1000-8000-00805f9b34fb", "ACCEL_X");
        ATTRIBUTES.put("0000ffa4-0000-1000-8000-00805f9b34fb", "ACCEL_Y");
        ATTRIBUTES.put("0000ffa5-0000-1000-8000-00805f9b34fb", "ACCEL_Z");
    }

    private static BleUtils INSTANCE;

    private BleUtils() {
    }

    public static BleUtils getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BleUtils();
        }
        return INSTANCE;
    }

    public static String getServiceUuidName(String uuidStr) {
        return ATTRIBUTES.containsKey(uuidStr) ? ATTRIBUTES.get(uuidStr)
                : "Unknown Services";
    }

    public static String getCharacteristicsUuidName(String uuidStr) {
        return ATTRIBUTES.containsKey(uuidStr) ? ATTRIBUTES.get(uuidStr)
                : "Unknown Characteristics";
    }

}
