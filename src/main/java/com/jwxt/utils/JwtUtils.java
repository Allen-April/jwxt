package com.jwxt.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName JwtUtils
 * @Descript
 * @Author Allen
 * @Date 2024/6/22 23:10
 **/
//下发和检验令牌
public class JwtUtils {

    private static String signKey = "xgd";  //签名密匙
    private  static Long expire = 43200000L; //有效时间十二个小时

    /*
    * 生成Jwt令牌
    * @param claoms Jwt第二部分负载 payload 响应数据中存储的内容
    * @return
    * */
    public static String generateJwt(Map<String, Object> claims){
        System.out.println("Secret Key: " + signKey);
        System.out.println("Secret Key: " + signKey);
        System.out.println("Secret Key: " + signKey);

        String jwt = Jwts.builder()
                .addClaims(claims)//自定义信息（有效载荷）
                .signWith(SignatureAlgorithm.HS256,signKey)//签名算法、密匙
                .setExpiration(new Date(System.currentTimeMillis() + expire))//过期时间（现在系统时间加上有效期）
                .compact();

        System.out.println("Secret Key: " + signKey);
        return jwt;
    }

    /**
     * 解析JWT令牌
     * @param jwt JWT令牌
     * @return JWT第二部分负载 payload 中存储的内容
     */
    public static Claims parseJWT(String jwt){
        Claims claims = Jwts.parser()
                .setSigningKey(signKey)//指定签名密钥
                .parseClaimsJws(jwt)//指定令牌Token
                .getBody();
        return claims;
    }
}


