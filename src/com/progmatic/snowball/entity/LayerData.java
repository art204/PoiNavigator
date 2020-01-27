package com.progmatic.snowball.entity;

// Generated 23.06.2015 16:19:08 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.progmatic.snowball.navigator.GeoPoint;

/**
 * LayerData generated by hbm2java
 */
//@Entity
//@Table(name = "layer_data", schema = "public")
//@SequenceGenerator(name="layer_data_id_seq", sequenceName="layer_data_id_seq", allocationSize=1)
//@Restrict
public class LayerData implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private long skiAreaId;
	private long layerTypeId;
	int zoomView;
	private SkiArea skiArea;
	private LayerType layerType;
	private String name;
	private String description;
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private String data;
	private String schemeData;
	private String demData;
	private Set<LayerDataInZoom> layerDataInZooms = new HashSet<LayerDataInZoom>(0);
	private Set<LayerSvgSegment> layerSvgSegments = new HashSet<LayerSvgSegment>(0);
	private List<GeoPoint> geoPoints;

	public LayerData() {
	}

	public LayerData(long id, long skiAreaId, long layerTypeId, SkiArea skiArea, LayerType layerType, int type, String name,
			double x1, double y1, double x2, double y2, String data) {
		this.id = id;
		this.skiAreaId = skiAreaId;
		this.layerTypeId = layerTypeId;
		this.skiArea = skiArea;
		this.layerType = layerType;
		this.name = name;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.data = data;
	}

	public LayerData(long id, long skiAreaId, long layerTypeId, int zoomView, SkiArea skiArea, LayerType layerType, int type, String name,
			String description, double x1, double y1, double x2, double y2,
			Set<LayerDataInZoom> layerDataInZooms, Set<LayerSvgSegment> layerSvgSegments, 
			String data, List<GeoPoint> geoPoints , String schemeData) {
		this.id = id;
		this.skiAreaId = skiAreaId;
		this.layerTypeId = layerTypeId;
		this.zoomView = zoomView;
		this.skiArea = skiArea;
		this.layerType = layerType;
		this.name = name;
		this.description = description;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.data = data;
		this.layerDataInZooms = layerDataInZooms;
		this.geoPoints = geoPoints;
		this.schemeData = schemeData;
		this.layerSvgSegments = layerSvgSegments;
	}

	//@Id
	//@Column(name = "id", unique = true, nullable = false)
  	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="layer_data_id_seq")
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	//@Column(name = "ski_area_id", insertable = false, updatable = false)
	public long getSkiAreaId() {
		return this.skiAreaId;
	}

	public void setSkiAreaId(long skiAreaId) {
		this.skiAreaId = skiAreaId;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "ski_area_id", nullable = false)
	//@NotNull
	//@JsonIgnore
	public SkiArea getSkiArea() {
		return this.skiArea;
	}

	public void setSkiArea(SkiArea skiArea) {
		this.skiArea = skiArea;
	}

	//@Column(name = "layer_type_id", insertable = false, updatable = false)
	public long getLayerTypeId() {
		return this.layerTypeId;
	}

	public void setLayerTypeId(long layerTypeId) {
		this.layerTypeId = layerTypeId;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "layer_type_id", nullable = false)
	//@NotNull
	//@JsonIgnore
	public LayerType getLayerType() {
		return this.layerType;
	}

	public void setLayerType(LayerType layerType) {
		this.layerType = layerType;
	}

	//@Column(name = "name", nullable = false, length = 125)
	//@NotNull
	//@Size(max = 125)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@Column(name = "description", length = 1024)
	//@Size(max = 1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//@Column(name = "x1", nullable = false, precision = 17, scale = 17)
	public double getX1() {
		return this.x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	//@Column(name = "y1", nullable = false, precision = 17, scale = 17)
	public double getY1() {
		return this.y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	//@Column(name = "x2", nullable = false, precision = 17, scale = 17)
	public double getX2() {
		return this.x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	//@Column(name = "y2", nullable = false, precision = 17, scale = 17)
	public double getY2() {
		return this.y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	//@Column(name = "data", nullable = false)
	//@NotNull
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "layerData")
	//@JsonIgnore
	public Set<LayerDataInZoom> getLayerDataInZooms() {
		return this.layerDataInZooms;
	}

	public void setLayerDataInZooms(Set<LayerDataInZoom> layerDataInZooms) {
		this.layerDataInZooms = layerDataInZooms;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "layerData")
	//@JsonIgnore
	public Set<LayerSvgSegment> getLayerSvgSegments() {
		return this.layerSvgSegments;
	}

	public void setLayerSvgSegments(Set<LayerSvgSegment> layerSvgSegments) {
		this.layerSvgSegments = layerSvgSegments;
	}

	//@ElementCollection(targetClass=ArrayList.class)	
	//@JsonIgnore
	public List<GeoPoint> geoPoints()
	{
		List<GeoPoint> result = new ArrayList<GeoPoint>();
		result = com.progmatic.snowball.utils.XmlParser.deSerializeGeoPointList(this.getData());
		this.geoPoints = result;
		
		return this.geoPoints;
	}
	
	//@Column(name = "zoom_view")
	public int getZoomView() {
		return this.zoomView;
	}

	public void setZoomView(int zoomView) {
		this.zoomView = zoomView;
	}

	//@Column(name = "scheme_data")
	public String getSchemeData() {
		return this.schemeData;
	}

	public void setSchemeData(String schemeData) {
		this.schemeData = schemeData;
	}
	
	//@Column(name = "dem_data", columnDefinition="text")
	public String getDemData() {
		return this.demData;
	}

	public void setDemData(String demData) {
		this.demData = demData;
	}

	public boolean haveXaml()
	{
		return (this.getSchemeData() != null && !this.getSchemeData().isEmpty());
	}
}
