/**Copyright 2015 Huawei Technologies Co., Ltd. All rights reserved.
eSDK is licensed under the Apache License, Version 2.0 ^(the "License"^);
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.huawei.cc.call.data;

import com.huawei.cc.utils.StringUtils;



/**
 * Function: VOIP注册相关的配置参数
 */
public class VOIPConfigParamsData
{

    /**
     * 当前用户的VOIP号码
     */
    private String voipNumber;

    /**
     * Voip登录密码
     */
    private String voipPassword;

    /**
     * 服务器地址
     */
    private String serverIp;

    /**
     * 服务器端口
     */
    private String serverPort;

    /**
     * 备用服务器地址
     */
    private String backUpServerIp;
    /**
     * 备用服务器端口
     */
    private String backUpServerPort;

    /**
     * 域名
     */
    private String domain = "huawei.com"; //给他默认为huawei.com 0619

    /**
     * 代理
     */
    private String userAgent = "";

    /**
     * 去国家码
     */
    private String outgoingAccessCode = "";

    /**
     * VOIP功能 注册是否要加域名支持
     */
    private boolean voipDomainFlag = true;

    /**
     * VOIP功能 是否支持
     */
    private boolean voipFlag = false;

    /**
     * 非WIFI下的 2G 3G VOIP 能力
     */
    private boolean notWIFIAbility = false;

    /**
     * 会议接入码
     */
    private String confCode = "";

    /**
     * 设备的IP地址
     */
    private String localIpAddress = "";

    /**
     * 终端号码
     */
    private String bindNo = "";

    /**
     * 当前登录账号的name   MAA返回
     */
    private String userName = "";

    /**
     *  MS 地址 是内网还是外网的标志，1 , 内网 。 2 外网  默认值是内网
     */
    private short location = 1;

    /**
     * 上报终端类型需要用到的 MAA 唯一识别标识
     */
    private String maaDeployID = "";

    /**
     * 音频编解码
     */
    private String audioCode = DEFAULT_AUDIO_CODE;

    /**
     * 3G 模式下的 audioCode
     */
    private String audioCodeFor3G = AUDIO_CODE_3G;

    /** audio 媒体 DSCP */
    private int audioDSCP;
    /** Video 媒体 DSCP */
    private int videoDSCP;
    /** 数据会议 DSCP */
    private int dataDSCP;
    /** SIP 信令的DSCP  0-64之间，默认为46 */
    private int sipDSCP;
    /** maa 媒体 DSCP */
    // private int maaDSCP;

    /** 硬解码能力 **/
    private boolean hardCodec = false;


    /**
     * 是否支持SIP主备注册
     */
    private boolean isSupportBackRegister = false;

    /**
     * 注册刷新可配时间
     */
    private int regExpires = DEFAULT_REG_EXPIRES;

    /**
     * 订阅刷新可配的时间
     */
    private int sessionExpires = DEFAULT_SESSION_EXPIRES;

    /** opus采样率 */
    private int opusSamplingFreq;

    /** Netate */
    private int netate;


    // 默认值
    public static final String DEFAULT_STRING = "";
    private static final String DEFAULT_AUDIO_CODE = "0,8,18,98,112"; // 默认的audioCode
    private static final String AUDIO_CODE_3G = "18,98,0,8,112";// 3G模式下的默认audioCode
    public static final int DEFAULT_SIP_DSCP = 46; // IP 信令的DSCP  0-64之间，默认为46 。
    public static final int DEFAULT_REG_EXPIRES = 300; // 默认的刷新注册超时时间为  300 s
    public static final int DEFAULT_SESSION_EXPIRES = 1800; // 默认的刷新订阅超时时间为  1800 s

    /**
     * @return the isSupportBackRegister
     */
    public boolean isSupportBackRegister()
    {
        return isSupportBackRegister;
    }


    public String getAudioCode()
    {
        // 3G 和 WIFI 环境下 默认的audioCode不一样
        if (StringUtils.is3GConnect())
        {
            return audioCodeFor3G;
        }
        else
        {
            return audioCode;
        }
    }

    /**
     * @return the voipPassword
     */
    public String getVoipPassword()
    {
        return voipPassword;
    }

    /**
     * @return the serverIp
     */
    public String getServerIp()
    {
        return serverIp;
    }

    /**
     * @return the serverPort
     */
    public String getServerPort()
    {
        return serverPort;
    }

    /**
     * @return the domain
     */
    public String getDomain()
    {
        return domain;
    }

    /**
     * @return the userAgent
     */
    public String getUserAgent()
    {
        return userAgent;
    }


    /**
     * @return the outgoingAccessCode
     */
    public String getOutgoingAccessCode()
    {
        return outgoingAccessCode;
    }

    /**
     * @return the voipDomainFlag
     */
    public boolean isVoipDomainFlag()
    {
        return voipDomainFlag;
    }

    /**
     * @return the voipFlag
     */
    public boolean isVoipFlag()
    {
        return voipFlag;
    }

    /**
     * @return the notWIFIAbility
     */
    public boolean isNotWIFIAbility()
    {
        return notWIFIAbility;
    }

    /**
     * @return the confCode
     */
    public String getConfCode()
    {
        return confCode;
    }

    /**
     * @return the localIpAddress
     */
    public String getLocalIpAddress()
    {
        return localIpAddress;
    }

    /**
     * @return the bindNo
     */
    public String getBindNo()
    {
        return bindNo;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @return the location
     */
    public short getLocation()
    {
        return location;
    }

    /**
     * @return the maaDeployID
     */
    public String getMaaDeployID()
    {
        return maaDeployID;
    }

    public int getAudioDSCP()
    {
        return audioDSCP;
    }

    public int getVideoDSCP()
    {
        return videoDSCP;
    }

    public int getDataDSCP()
    {
        return dataDSCP;
    }

    public int getSipDSCP()
    {
        return sipDSCP;
    }


    public boolean isHardCodec()
    {
        return hardCodec;
    }


    /**
      * Create an  instance of  VOIPConfigParamsData .
      * <p>Description:  对象生命周期和Service一致，在第一次成功后初始化数据，
      * 初始化数据依赖CheckVersion返回的部分数据。CheckVersion返回的数据需要写文件保存，Login返回的不需要。</p>
      * <p></p>
     */
    public VOIPConfigParamsData()
    {
    }


    /**
     * 重写resetData0619
     */
    public void resetData(String phoneNo,String password,String sipServerIp,String sipServerPort)
    {
            //初始化VOIP数据
            this.voipNumber = phoneNo;
            this.bindNo = phoneNo;
            this.voipPassword = password;
            this.serverIp = sipServerIp;
            this.serverPort = sipServerPort;
    }


    public String getVoipNumber()
    {
        return StringUtils.remove(voipNumber, 0, '0');
    }


    public String getUserNameVoip()
    {
        String strImpi = "";
        if (voipDomainFlag)
        {
            strImpi += '@' + domain;
        }
        return strImpi;
    }


    public static final int E_NTF_CALLEE_CALL_TO_CONF_SUCCESS = 5000;


    public String getBackUpServerIp()
    {
        return backUpServerIp;
    }

    public String getBackUpServerPort()
    {
        return backUpServerPort;
    }

    public int getRegExpires()
    {
        return regExpires;
    }

    public int getSessionExpires()
    {
        return sessionExpires;
    }

    public int getOpusSamplingFreq()
    {
        return opusSamplingFreq;
    }

    public int getNetate()
    {
        return netate;
    }

}
