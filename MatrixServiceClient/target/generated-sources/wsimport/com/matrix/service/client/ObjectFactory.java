
package com.matrix.service.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.matrix.service.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MatrixOperationException_QNAME = new QName("http://service.matrix.com/", "MatrixOperationException");
    private final static QName _AddMatrices_QNAME = new QName("http://service.matrix.com/", "addMatrices");
    private final static QName _AddMatricesResponse_QNAME = new QName("http://service.matrix.com/", "addMatricesResponse");
    private final static QName _CalculateDeterminant_QNAME = new QName("http://service.matrix.com/", "calculateDeterminant");
    private final static QName _CalculateDeterminantResponse_QNAME = new QName("http://service.matrix.com/", "calculateDeterminantResponse");
    private final static QName _CalculateTrace_QNAME = new QName("http://service.matrix.com/", "calculateTrace");
    private final static QName _CalculateTraceResponse_QNAME = new QName("http://service.matrix.com/", "calculateTraceResponse");
    private final static QName _InvertMatrix_QNAME = new QName("http://service.matrix.com/", "invertMatrix");
    private final static QName _InvertMatrixResponse_QNAME = new QName("http://service.matrix.com/", "invertMatrixResponse");
    private final static QName _MultiplyByScalar_QNAME = new QName("http://service.matrix.com/", "multiplyByScalar");
    private final static QName _MultiplyByScalarResponse_QNAME = new QName("http://service.matrix.com/", "multiplyByScalarResponse");
    private final static QName _MultiplyMatrices_QNAME = new QName("http://service.matrix.com/", "multiplyMatrices");
    private final static QName _MultiplyMatricesResponse_QNAME = new QName("http://service.matrix.com/", "multiplyMatricesResponse");
    private final static QName _SquareMatrix_QNAME = new QName("http://service.matrix.com/", "squareMatrix");
    private final static QName _SquareMatrixResponse_QNAME = new QName("http://service.matrix.com/", "squareMatrixResponse");
    private final static QName _TransposeMatrix_QNAME = new QName("http://service.matrix.com/", "transposeMatrix");
    private final static QName _TransposeMatrixResponse_QNAME = new QName("http://service.matrix.com/", "transposeMatrixResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.matrix.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MatrixOperationException }
     * 
     */
    public MatrixOperationException createMatrixOperationException() {
        return new MatrixOperationException();
    }

    /**
     * Create an instance of {@link AddMatrices }
     * 
     */
    public AddMatrices createAddMatrices() {
        return new AddMatrices();
    }

    /**
     * Create an instance of {@link AddMatricesResponse }
     * 
     */
    public AddMatricesResponse createAddMatricesResponse() {
        return new AddMatricesResponse();
    }

    /**
     * Create an instance of {@link CalculateDeterminant }
     * 
     */
    public CalculateDeterminant createCalculateDeterminant() {
        return new CalculateDeterminant();
    }

    /**
     * Create an instance of {@link CalculateDeterminantResponse }
     * 
     */
    public CalculateDeterminantResponse createCalculateDeterminantResponse() {
        return new CalculateDeterminantResponse();
    }

    /**
     * Create an instance of {@link CalculateTrace }
     * 
     */
    public CalculateTrace createCalculateTrace() {
        return new CalculateTrace();
    }

    /**
     * Create an instance of {@link CalculateTraceResponse }
     * 
     */
    public CalculateTraceResponse createCalculateTraceResponse() {
        return new CalculateTraceResponse();
    }

    /**
     * Create an instance of {@link InvertMatrix }
     * 
     */
    public InvertMatrix createInvertMatrix() {
        return new InvertMatrix();
    }

    /**
     * Create an instance of {@link InvertMatrixResponse }
     * 
     */
    public InvertMatrixResponse createInvertMatrixResponse() {
        return new InvertMatrixResponse();
    }

    /**
     * Create an instance of {@link MultiplyByScalar }
     * 
     */
    public MultiplyByScalar createMultiplyByScalar() {
        return new MultiplyByScalar();
    }

    /**
     * Create an instance of {@link MultiplyByScalarResponse }
     * 
     */
    public MultiplyByScalarResponse createMultiplyByScalarResponse() {
        return new MultiplyByScalarResponse();
    }

    /**
     * Create an instance of {@link MultiplyMatrices }
     * 
     */
    public MultiplyMatrices createMultiplyMatrices() {
        return new MultiplyMatrices();
    }

    /**
     * Create an instance of {@link MultiplyMatricesResponse }
     * 
     */
    public MultiplyMatricesResponse createMultiplyMatricesResponse() {
        return new MultiplyMatricesResponse();
    }

    /**
     * Create an instance of {@link SquareMatrix }
     * 
     */
    public SquareMatrix createSquareMatrix() {
        return new SquareMatrix();
    }

    /**
     * Create an instance of {@link SquareMatrixResponse }
     * 
     */
    public SquareMatrixResponse createSquareMatrixResponse() {
        return new SquareMatrixResponse();
    }

    /**
     * Create an instance of {@link TransposeMatrix }
     * 
     */
    public TransposeMatrix createTransposeMatrix() {
        return new TransposeMatrix();
    }

    /**
     * Create an instance of {@link TransposeMatrixResponse }
     * 
     */
    public TransposeMatrixResponse createTransposeMatrixResponse() {
        return new TransposeMatrixResponse();
    }

    /**
     * Create an instance of {@link Matrix }
     * 
     */
    public Matrix createMatrix() {
        return new Matrix();
    }

    /**
     * Create an instance of {@link DoubleArray }
     * 
     */
    public DoubleArray createDoubleArray() {
        return new DoubleArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixOperationException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MatrixOperationException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "MatrixOperationException")
    public JAXBElement<MatrixOperationException> createMatrixOperationException(MatrixOperationException value) {
        return new JAXBElement<MatrixOperationException>(_MatrixOperationException_QNAME, MatrixOperationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMatrices }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMatrices }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "addMatrices")
    public JAXBElement<AddMatrices> createAddMatrices(AddMatrices value) {
        return new JAXBElement<AddMatrices>(_AddMatrices_QNAME, AddMatrices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMatricesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMatricesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "addMatricesResponse")
    public JAXBElement<AddMatricesResponse> createAddMatricesResponse(AddMatricesResponse value) {
        return new JAXBElement<AddMatricesResponse>(_AddMatricesResponse_QNAME, AddMatricesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDeterminant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateDeterminant }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "calculateDeterminant")
    public JAXBElement<CalculateDeterminant> createCalculateDeterminant(CalculateDeterminant value) {
        return new JAXBElement<CalculateDeterminant>(_CalculateDeterminant_QNAME, CalculateDeterminant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDeterminantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateDeterminantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "calculateDeterminantResponse")
    public JAXBElement<CalculateDeterminantResponse> createCalculateDeterminantResponse(CalculateDeterminantResponse value) {
        return new JAXBElement<CalculateDeterminantResponse>(_CalculateDeterminantResponse_QNAME, CalculateDeterminantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateTrace }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateTrace }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "calculateTrace")
    public JAXBElement<CalculateTrace> createCalculateTrace(CalculateTrace value) {
        return new JAXBElement<CalculateTrace>(_CalculateTrace_QNAME, CalculateTrace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateTraceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateTraceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "calculateTraceResponse")
    public JAXBElement<CalculateTraceResponse> createCalculateTraceResponse(CalculateTraceResponse value) {
        return new JAXBElement<CalculateTraceResponse>(_CalculateTraceResponse_QNAME, CalculateTraceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvertMatrix }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvertMatrix }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "invertMatrix")
    public JAXBElement<InvertMatrix> createInvertMatrix(InvertMatrix value) {
        return new JAXBElement<InvertMatrix>(_InvertMatrix_QNAME, InvertMatrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvertMatrixResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvertMatrixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "invertMatrixResponse")
    public JAXBElement<InvertMatrixResponse> createInvertMatrixResponse(InvertMatrixResponse value) {
        return new JAXBElement<InvertMatrixResponse>(_InvertMatrixResponse_QNAME, InvertMatrixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyByScalar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplyByScalar }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "multiplyByScalar")
    public JAXBElement<MultiplyByScalar> createMultiplyByScalar(MultiplyByScalar value) {
        return new JAXBElement<MultiplyByScalar>(_MultiplyByScalar_QNAME, MultiplyByScalar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyByScalarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplyByScalarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "multiplyByScalarResponse")
    public JAXBElement<MultiplyByScalarResponse> createMultiplyByScalarResponse(MultiplyByScalarResponse value) {
        return new JAXBElement<MultiplyByScalarResponse>(_MultiplyByScalarResponse_QNAME, MultiplyByScalarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyMatrices }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplyMatrices }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "multiplyMatrices")
    public JAXBElement<MultiplyMatrices> createMultiplyMatrices(MultiplyMatrices value) {
        return new JAXBElement<MultiplyMatrices>(_MultiplyMatrices_QNAME, MultiplyMatrices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyMatricesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplyMatricesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "multiplyMatricesResponse")
    public JAXBElement<MultiplyMatricesResponse> createMultiplyMatricesResponse(MultiplyMatricesResponse value) {
        return new JAXBElement<MultiplyMatricesResponse>(_MultiplyMatricesResponse_QNAME, MultiplyMatricesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareMatrix }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SquareMatrix }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "squareMatrix")
    public JAXBElement<SquareMatrix> createSquareMatrix(SquareMatrix value) {
        return new JAXBElement<SquareMatrix>(_SquareMatrix_QNAME, SquareMatrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareMatrixResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SquareMatrixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "squareMatrixResponse")
    public JAXBElement<SquareMatrixResponse> createSquareMatrixResponse(SquareMatrixResponse value) {
        return new JAXBElement<SquareMatrixResponse>(_SquareMatrixResponse_QNAME, SquareMatrixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransposeMatrix }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransposeMatrix }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "transposeMatrix")
    public JAXBElement<TransposeMatrix> createTransposeMatrix(TransposeMatrix value) {
        return new JAXBElement<TransposeMatrix>(_TransposeMatrix_QNAME, TransposeMatrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransposeMatrixResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransposeMatrixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.matrix.com/", name = "transposeMatrixResponse")
    public JAXBElement<TransposeMatrixResponse> createTransposeMatrixResponse(TransposeMatrixResponse value) {
        return new JAXBElement<TransposeMatrixResponse>(_TransposeMatrixResponse_QNAME, TransposeMatrixResponse.class, null, value);
    }

}
