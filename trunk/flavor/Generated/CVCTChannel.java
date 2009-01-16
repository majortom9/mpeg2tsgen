/* @flavorc
 *
 * CVCTChannel.java
 * 
 * This file was automatically generated by flavorc
 * from the source file:
 *     '../FormalDefs/CVCT_section.fl'
 *
 * For information on flavorc, visit the Flavor Web site at:
 *     http://flavor.sourceforge.net
 *
 * -- Do not edit by hand --
 *
 */

package flavor.Generated;
import flavor.*;
import java.io.*;

public class CVCTChannel {
    int short_name[] = new int[64];
    int reserved1;
    int major_channel_number;
    int minor_channel_number;
    int modulation_mode;
    int carrier_frequency;
    int channel_TSID;
    int program_number;
    int ETM_location;
    int access_controlled;
    int hidden;
    int path_select;
    int out_of_band;
    int hide_guide;
    int reserved3;
    int service_type;
    int source_id;
    int reserved4;
    int descriptors_length;
    int remain_desc_bytes;
    Descriptor descriptor;

    public int get(IBitstream _F_bs) throws IOException {
        int _F_ret = 0;
        MapResult _F_mr;
        int _F_dim0, _F_dim0_end;
        int _F_parse = 0;
        Util.trace(_F_bs.getpos(), 0, (int)0, "begin CVCTChannel");
        _F_dim0_end = 7;
        for (_F_dim0 = 0; _F_dim0 < _F_dim0_end; _F_dim0++) {
            _F_parse = 16;
            short_name[_F_dim0] = _F_bs.getbits(_F_parse);
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)short_name[_F_dim0], "short_name[" + _F_dim0 + "]" +  " (" + short_name[_F_dim0] + ")");
        }
        _F_parse = 4;
        reserved1 = _F_bs.getbits(_F_parse);
        if (reserved1 != 15) {
            Util.flerror("Const value mismatch for 'reserved1'");
            _F_ret++;
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved1, "reserved1" +  " (" + reserved1 + ") [ERROR]");
        }
        else {
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved1, "reserved1" +  " (" + reserved1 + ")");
        }
        _F_parse = 10;
        major_channel_number = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)major_channel_number, "major_channel_number" +  " (" + major_channel_number + ")");
        _F_parse = 10;
        minor_channel_number = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)minor_channel_number, "minor_channel_number" +  " (" + minor_channel_number + ")");
        _F_parse = 8;
        modulation_mode = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)modulation_mode, "modulation_mode" +  " (" + modulation_mode + ")");
        _F_parse = 32;
        carrier_frequency = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)carrier_frequency, "carrier_frequency" +  " (" + carrier_frequency + ")");
        _F_parse = 16;
        channel_TSID = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)channel_TSID, "channel_TSID" +  " (" + channel_TSID + ")");
        _F_parse = 16;
        program_number = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)program_number, "program_number" +  " (" + program_number + ")");
        _F_parse = 2;
        ETM_location = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)ETM_location, "ETM_location" +  " (" + ETM_location + ")");
        _F_parse = 1;
        access_controlled = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)access_controlled, "access_controlled" +  " (" + access_controlled + ")");
        _F_parse = 1;
        hidden = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)hidden, "hidden" +  " (" + hidden + ")");
        _F_parse = 1;
        path_select = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)path_select, "path_select" +  " (" + path_select + ")");
        _F_parse = 1;
        out_of_band = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)out_of_band, "out_of_band" +  " (" + out_of_band + ")");
        _F_parse = 1;
        hide_guide = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)hide_guide, "hide_guide" +  " (" + hide_guide + ")");
        _F_parse = 3;
        reserved3 = _F_bs.getbits(_F_parse);
        if (reserved3 != 7) {
            Util.flerror("Const value mismatch for 'reserved3'");
            _F_ret++;
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved3, "reserved3" +  " (" + reserved3 + ") [ERROR]");
        }
        else {
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved3, "reserved3" +  " (" + reserved3 + ")");
        }
        _F_parse = 6;
        service_type = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)service_type, "service_type" +  " (" + service_type + ")");
        _F_parse = 16;
        source_id = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)source_id, "source_id" +  " (" + source_id + ")");
        _F_parse = 6;
        reserved4 = _F_bs.getbits(_F_parse);
        if (reserved4 != 63) {
            Util.flerror("Const value mismatch for 'reserved4'");
            _F_ret++;
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved4, "reserved4" +  " (" + reserved4 + ") [ERROR]");
        }
        else {
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved4, "reserved4" +  " (" + reserved4 + ")");
        }
        _F_parse = 10;
        descriptors_length = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)descriptors_length, "descriptors_length" +  " (" + descriptors_length + ")");
        remain_desc_bytes = descriptors_length;
        while (remain_desc_bytes>0) {
            Util.trace(_F_bs.getpos(), 0, (int)0, "processing Descriptor descriptor");
            descriptor = new Descriptor();
            _F_ret += descriptor.get(_F_bs);
            remain_desc_bytes-=(descriptor._F_lengthof/8);
            if (1==0) break;
        }
        Util.trace(_F_bs.getpos(), 0, (int)0, "end CVCTChannel");
        return _F_ret;
    }

    public int put(IBitstream _F_bs) throws IOException {
        int _F_ret = 0;
        MapResult _F_mr;
        int _F_dim0, _F_dim0_end;
        int _F_parse = 0;
        _F_dim0_end = 7;
        for (_F_dim0 = 0; _F_dim0 < _F_dim0_end; _F_dim0++) {
            _F_bs.putbits(short_name[_F_dim0], 16);
        }
        _F_parse = 4;
        reserved1 = 15;
        _F_bs.putbits(reserved1, _F_parse);
        _F_bs.putbits(major_channel_number, 10);
        _F_bs.putbits(minor_channel_number, 10);
        _F_bs.putbits(modulation_mode, 8);
        _F_bs.putbits(carrier_frequency, 32);
        _F_bs.putbits(channel_TSID, 16);
        _F_bs.putbits(program_number, 16);
        _F_bs.putbits(ETM_location, 2);
        _F_bs.putbits(access_controlled, 1);
        _F_bs.putbits(hidden, 1);
        _F_bs.putbits(path_select, 1);
        _F_bs.putbits(out_of_band, 1);
        _F_bs.putbits(hide_guide, 1);
        _F_parse = 3;
        reserved3 = 7;
        _F_bs.putbits(reserved3, _F_parse);
        _F_bs.putbits(service_type, 6);
        _F_bs.putbits(source_id, 16);
        _F_parse = 6;
        reserved4 = 63;
        _F_bs.putbits(reserved4, _F_parse);
        _F_bs.putbits(descriptors_length, 10);
        remain_desc_bytes = descriptors_length;
        while (remain_desc_bytes>0) {
            _F_ret += descriptor.put(_F_bs);
            remain_desc_bytes-=(descriptor._F_lengthof/8);
            if (1==0) break;
        }
        return _F_ret;
    }

    public int putxml(IBitstream _F_bs, boolean bAttr) throws IOException {
        int _F_ret = 0;
        MapResult _F_mr;
        int _F_dim0, _F_dim0_end;
        int _F_parse = 0;
        _F_dim0_end = 7;
        for (_F_dim0 = 0; _F_dim0 < _F_dim0_end; _F_dim0++) {
            _F_parse = 16;
            short_name[_F_dim0] = _F_bs.getbits(_F_parse);
            if (bAttr) {
                XML.WriteXmlElement("<short_name type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + short_name[_F_dim0] + "</short_name>");
            }
            else {
                XML.WriteXmlElement("<short_name bitLen=\"" + _F_parse + "\">" + short_name[_F_dim0] + "</short_name>");
            }
        }
        _F_parse = 4;
        reserved1 = _F_bs.getbits(_F_parse);
        if (reserved1 != 15) {
            Util.flerror("Const value mismatch for 'reserved1'");
            _F_ret++;
            if (bAttr) {
                XML.WriteXmlElement("<reserved1 type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + reserved1 + "</reserved1>");
            }
            else {
                XML.WriteXmlElement("<reserved1 bitLen=\"" + _F_parse + "\">" + reserved1 + "</reserved1>");
            }
        }
        else {
            if (bAttr) {
                XML.WriteXmlElement("<reserved1 type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + reserved1 + "</reserved1>");
            }
            else {
                XML.WriteXmlElement("<reserved1 bitLen=\"" + _F_parse + "\">" + reserved1 + "</reserved1>");
            }
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved1, "reserved1" +  " (" + reserved1 + ")");
        }
        _F_parse = 10;
        major_channel_number = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<major_channel_number type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + major_channel_number + "</major_channel_number>");
        }
        else {
            XML.WriteXmlElement("<major_channel_number bitLen=\"" + _F_parse + "\">" + major_channel_number + "</major_channel_number>");
        }
        _F_parse = 10;
        minor_channel_number = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<minor_channel_number type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + minor_channel_number + "</minor_channel_number>");
        }
        else {
            XML.WriteXmlElement("<minor_channel_number bitLen=\"" + _F_parse + "\">" + minor_channel_number + "</minor_channel_number>");
        }
        _F_parse = 8;
        modulation_mode = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<modulation_mode type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + modulation_mode + "</modulation_mode>");
        }
        else {
            XML.WriteXmlElement("<modulation_mode bitLen=\"" + _F_parse + "\">" + modulation_mode + "</modulation_mode>");
        }
        _F_parse = 32;
        carrier_frequency = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<carrier_frequency type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + carrier_frequency + "</carrier_frequency>");
        }
        else {
            XML.WriteXmlElement("<carrier_frequency bitLen=\"" + _F_parse + "\">" + carrier_frequency + "</carrier_frequency>");
        }
        _F_parse = 16;
        channel_TSID = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<channel_TSID type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + channel_TSID + "</channel_TSID>");
        }
        else {
            XML.WriteXmlElement("<channel_TSID bitLen=\"" + _F_parse + "\">" + channel_TSID + "</channel_TSID>");
        }
        _F_parse = 16;
        program_number = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<program_number type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + program_number + "</program_number>");
        }
        else {
            XML.WriteXmlElement("<program_number bitLen=\"" + _F_parse + "\">" + program_number + "</program_number>");
        }
        _F_parse = 2;
        ETM_location = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<ETM_location type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + ETM_location + "</ETM_location>");
        }
        else {
            XML.WriteXmlElement("<ETM_location bitLen=\"" + _F_parse + "\">" + ETM_location + "</ETM_location>");
        }
        _F_parse = 1;
        access_controlled = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<access_controlled type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + access_controlled + "</access_controlled>");
        }
        else {
            XML.WriteXmlElement("<access_controlled bitLen=\"" + _F_parse + "\">" + access_controlled + "</access_controlled>");
        }
        _F_parse = 1;
        hidden = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<hidden type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + hidden + "</hidden>");
        }
        else {
            XML.WriteXmlElement("<hidden bitLen=\"" + _F_parse + "\">" + hidden + "</hidden>");
        }
        _F_parse = 1;
        path_select = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<path_select type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + path_select + "</path_select>");
        }
        else {
            XML.WriteXmlElement("<path_select bitLen=\"" + _F_parse + "\">" + path_select + "</path_select>");
        }
        _F_parse = 1;
        out_of_band = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<out_of_band type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + out_of_band + "</out_of_band>");
        }
        else {
            XML.WriteXmlElement("<out_of_band bitLen=\"" + _F_parse + "\">" + out_of_band + "</out_of_band>");
        }
        _F_parse = 1;
        hide_guide = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<hide_guide type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + hide_guide + "</hide_guide>");
        }
        else {
            XML.WriteXmlElement("<hide_guide bitLen=\"" + _F_parse + "\">" + hide_guide + "</hide_guide>");
        }
        _F_parse = 3;
        reserved3 = _F_bs.getbits(_F_parse);
        if (reserved3 != 7) {
            Util.flerror("Const value mismatch for 'reserved3'");
            _F_ret++;
            if (bAttr) {
                XML.WriteXmlElement("<reserved3 type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + reserved3 + "</reserved3>");
            }
            else {
                XML.WriteXmlElement("<reserved3 bitLen=\"" + _F_parse + "\">" + reserved3 + "</reserved3>");
            }
        }
        else {
            if (bAttr) {
                XML.WriteXmlElement("<reserved3 type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + reserved3 + "</reserved3>");
            }
            else {
                XML.WriteXmlElement("<reserved3 bitLen=\"" + _F_parse + "\">" + reserved3 + "</reserved3>");
            }
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved3, "reserved3" +  " (" + reserved3 + ")");
        }
        _F_parse = 6;
        service_type = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<service_type type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + service_type + "</service_type>");
        }
        else {
            XML.WriteXmlElement("<service_type bitLen=\"" + _F_parse + "\">" + service_type + "</service_type>");
        }
        _F_parse = 16;
        source_id = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<source_id type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + source_id + "</source_id>");
        }
        else {
            XML.WriteXmlElement("<source_id bitLen=\"" + _F_parse + "\">" + source_id + "</source_id>");
        }
        _F_parse = 6;
        reserved4 = _F_bs.getbits(_F_parse);
        if (reserved4 != 63) {
            Util.flerror("Const value mismatch for 'reserved4'");
            _F_ret++;
            if (bAttr) {
                XML.WriteXmlElement("<reserved4 type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + reserved4 + "</reserved4>");
            }
            else {
                XML.WriteXmlElement("<reserved4 bitLen=\"" + _F_parse + "\">" + reserved4 + "</reserved4>");
            }
        }
        else {
            if (bAttr) {
                XML.WriteXmlElement("<reserved4 type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + reserved4 + "</reserved4>");
            }
            else {
                XML.WriteXmlElement("<reserved4 bitLen=\"" + _F_parse + "\">" + reserved4 + "</reserved4>");
            }
            Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)reserved4, "reserved4" +  " (" + reserved4 + ")");
        }
        _F_parse = 10;
        descriptors_length = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<descriptors_length type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + descriptors_length + "</descriptors_length>");
        }
        else {
            XML.WriteXmlElement("<descriptors_length bitLen=\"" + _F_parse + "\">" + descriptors_length + "</descriptors_length>");
        }
        remain_desc_bytes = descriptors_length;
        while (remain_desc_bytes>0) {
            Util.trace(_F_bs.getpos(), 0, (int)0, "processing Descriptor descriptor");
            descriptor = new Descriptor();
            XML.IntoAClass("descriptor", 0);
            _F_ret += descriptor.putxml(_F_bs, bAttr);
            XML.OutOfClass("</descriptor>");
            remain_desc_bytes-=(descriptor._F_lengthof/8);
            if (1==0) break;
        }
        return _F_ret;
    }
}
