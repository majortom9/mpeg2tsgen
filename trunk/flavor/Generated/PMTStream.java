/* @flavorc
 *
 * PMTStream.java
 * 
 * This file was automatically generated by flavorc
 * from the source file:
 *     '../FormalDefs/PMT_section.fl'
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

public class PMTStream {
    int _F_lengthof;
    int stream_type;
    int elementary_PID;
    int ES_info_length;
    int remain_desc_bytes;
    Descriptor descriptor;

    public int get(IBitstream _F_bs) throws IOException {
        int _F_ret = 0;
        MapResult _F_mr;
        int _F_parse = 0;
        Util.trace(_F_bs.getpos(), 0, (int)0, "begin PMTStream");
        _F_lengthof = _F_bs.getpos();
        _F_parse = 8;
        stream_type = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)stream_type, "stream_type" +  " (" + stream_type + ")");
        _F_bs.skipbits(3);
        _F_parse = 13;
        elementary_PID = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)elementary_PID, "elementary_PID" +  " (" + elementary_PID + ")");
        _F_bs.skipbits(4);
        _F_parse = 12;
        ES_info_length = _F_bs.getbits(_F_parse);
        Util.trace(_F_bs.getpos()-_F_parse, _F_parse, (int)ES_info_length, "ES_info_length" +  " (" + ES_info_length + ")");
        remain_desc_bytes = ES_info_length;
        while (remain_desc_bytes>0) {
            Util.trace(_F_bs.getpos(), 0, (int)0, "processing Descriptor descriptor");
            descriptor = new Descriptor();
            _F_ret += descriptor.get(_F_bs);
            remain_desc_bytes-=descriptor._F_lengthof;
            if (1==0) break;
        }
        _F_lengthof = _F_bs.getpos()-_F_lengthof;
        Util.trace(_F_bs.getpos(), 0, (int)0, "end PMTStream");
        return _F_ret;
    }

    public int put(IBitstream _F_bs) throws IOException {
        int _F_ret = 0;
        MapResult _F_mr;
        _F_lengthof = _F_bs.getpos();
        _F_bs.putbits(stream_type, 8);
        _F_bs.skipbits(3);
        _F_bs.putbits(elementary_PID, 13);
        _F_bs.skipbits(4);
        _F_bs.putbits(ES_info_length, 12);
        remain_desc_bytes = ES_info_length;
        while (remain_desc_bytes>0) {
            _F_ret += descriptor.put(_F_bs);
            remain_desc_bytes-=descriptor._F_lengthof;
            if (1==0) break;
        }
        _F_lengthof = _F_bs.getpos()-_F_lengthof;
        return _F_ret;
    }

    public int putxml(IBitstream _F_bs, boolean bAttr) throws IOException {
        int _F_ret = 0;
        MapResult _F_mr;
        int _F_parse = 0;
        _F_lengthof = _F_bs.getpos();
        _F_parse = 8;
        stream_type = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<stream_type type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + stream_type + "</stream_type>");
        }
        else {
            XML.WriteXmlElement("<stream_type bitLen=\"" + _F_parse + "\">" + stream_type + "</stream_type>");
        }
        _F_bs.skipbits(3);
        _F_parse = 13;
        elementary_PID = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<elementary_PID type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + elementary_PID + "</elementary_PID>");
        }
        else {
            XML.WriteXmlElement("<elementary_PID bitLen=\"" + _F_parse + "\">" + elementary_PID + "</elementary_PID>");
        }
        _F_bs.skipbits(4);
        _F_parse = 12;
        ES_info_length = _F_bs.getbits(_F_parse);
        if (bAttr) {
            XML.WriteXmlElement("<ES_info_length type=\"flUInt\" bitLen=\"" + _F_parse + "\">" + ES_info_length + "</ES_info_length>");
        }
        else {
            XML.WriteXmlElement("<ES_info_length bitLen=\"" + _F_parse + "\">" + ES_info_length + "</ES_info_length>");
        }
        remain_desc_bytes = ES_info_length;
        while (remain_desc_bytes>0) {
            Util.trace(_F_bs.getpos(), 0, (int)0, "processing Descriptor descriptor");
            descriptor = new Descriptor();
            XML.IntoAClass("descriptor", 0);
            _F_ret += descriptor.putxml(_F_bs, bAttr);
            XML.OutOfClass("</descriptor>");
            remain_desc_bytes-=descriptor._F_lengthof;
            if (1==0) break;
        }
        _F_lengthof = _F_bs.getpos()-_F_lengthof;
        return _F_ret;
    }
}