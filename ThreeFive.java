����   4 X  assignmenttwo/ThreeFive  java/lang/Object role Ljava/lang/String; <init> ()V Code
     LineNumberTable LocalVariableTable this Lassignmenttwo/ThreeFive; main ([Ljava/lang/String;)V	    java/lang/System   out Ljava/io/PrintStream;  Enter your role
    java/io/PrintStream   println (Ljava/lang/String;)V ! java/util/Scanner	  # $ % in Ljava/io/InputStream;
   '  ( (Ljava/io/InputStream;)V
   * + , next ()Ljava/lang/String;	  .  
 0 2 1 java/lang/String 3 4 hashCode ()I 6 Administrator
 0 8 9 : equals (Ljava/lang/Object;)Z < java/lang/StringBuilder > Welcome 
 ; @  
 ; B C D append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 ; F G , toString I Faculty K Staff M Student O Guest args [Ljava/lang/String; k1 Ljava/util/Scanner; StackMapTable Q 
SourceFile ThreeFive.java !                	   /     *� 
�                        	    	  �    Z� � �  Y� "� &L+� )� -� -YM� /�   7   ��   ,5� 7� �� � ;Y=� ?� -� A� E� � -YN� /�      �   "$2D   -H� 7� � ܲ � ;Y=� ?� -� A� E� � -Y:� /�     �   ���   J� 7� � �� � ;Y=� ?� -� A� E� � -Y:� /�    w   �7   L� 7� � [� � ;Y=� ?� -� A� E� � -Y:� /�    7   =�   N� 7� � � � ;Y=� ?� -� A� E� �       :           @ ! X " � $ � % � ' � ( * +A -Y /       Z P Q   G R S  T   5 � 4   0� 3 0� 3 0� 2 0� 2 0�   U      V    W