/**
 * How enums will is able to maintain the singleton property?
 * 
 * - Though enums have constructor 
 * - but program can't access this constructor 
 * - so is reflection also cant access this contructon
 * - only JVM handles the creation/execution of enum constructors
 * 
 * JVM internally ensures that the value of the enums are initialized only once
 * 
 * Problem with this approach?
 * Lazy initialization is not possible, instance is created upfront
 * 
 */
public enum ReflectionSafeSingleton{
    INSTANCE;
}